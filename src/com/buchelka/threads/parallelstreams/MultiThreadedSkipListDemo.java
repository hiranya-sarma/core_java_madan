package com.buchelka.threads.parallelstreams;

import java.util.Random;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class MultiThreadedSkipListDemo {

    // Simple record representing a Person
    record Person(int id, String name, int score) {}

    public static void main(String[] args) {
        // =========================================================================
        // STEP 1: INITIAL DATA GENERATION
        // Generate 10,000 dummy Person objects using parallel stream.
        // =========================================================================
        System.out.println("Generating 10,000 initial Person records...");

        Random random = new Random();

        Person[] initialPersons = Stream.generate(
                () -> new Person(random.nextInt(100_000), // Random ID between 0 and 99,999
                        "Person" + random.nextInt(100_000),
                        random.nextInt(100) // Initial score between 0 and 99
                ))
                .limit(10000)
                .toArray(Person[]::new);

        // =========================================================================
        // STEP 2: INITIALIZE THE CONCURRENTSKIPLISTMAP
        // ConcurrentSkipListMap automatically maintains keys in natural sorted order.
        // It uses lock-free / fine-grained skip-list algorithms for concurrent safety.
        // =========================================================================

        ConcurrentSkipListMap<Integer, Person> personMap = new ConcurrentSkipListMap<>();

        // Populate initial map in parallel using Java Streams
        Stream.of(initialPersons)
                .parallel()
                .forEach((person) -> personMap.put(person.id, person));

        System.out.println("Initial map size (duplicates deduplicated by ID): " + personMap.size());
        System.out.println("Initial lowest ID: " + personMap.firstKey() + " | highest ID: " + personMap.lastKey());
        System.out.println("------------------------------------------------------------------");

        // =========================================================================
        // STEP 3: PREPARE MULTI-THREADED WORKERS
        // We spin up a thread pool of 4 distinct threads doing different operations
        // SIMULTANEOUSLY on the exact same map instance.
        // =========================================================================

        ExecutorService executor = Executors.newFixedThreadPool(4);

        // --- TASK A: WRITER THREAD ---
        // Continuously inserts brand-new high-ID persons into the map

        Runnable insertTask = ()->{
            for(int i=0;i<1000;i++){
                int newId = 100_000 + i; // High IDs (100000+)
                personMap.put(newId, new Person(newId, "NewUser_" + i, 100));

            }
            System.out.println("[Writer Thread] Completed inserting 1,000 new records.");
        };

        // --- TASK B: UPDATER THREAD ---
        // Atomic modification using computeIfPresent!
        // Increment scores for all existing entries without lock contention
        Runnable updateTask = ()->{
            int updatedCount = 0;
            for(Integer id : personMap.keySet() ){
                // computeIfPresent guarantees the read-modify-write is atomic per key
                personMap.computeIfPresent(id, (key, oldPerson)->
                   new Person(oldPerson.id, oldPerson.name, oldPerson.score + 10)
                );

                updatedCount++;
            }
            System.out.println("[Updater Thread] Completed updating " + updatedCount + " existing records.");
        };

        // --- TASK C: REMOVER THREAD ---
        // Removes lower-range IDs safely while other threads are reading/writing
        Runnable removeTask = ()->{
            int removedCount = 0;
            // Iterate over a snapshot/lock-free view of keys
            for(Integer id : personMap.keySet()){
                if (personMap.remove(id) != null) {
                    removedCount++;
                }
            }
            System.out.println("[Remover Thread] Completed removing " + removedCount + " low-ID records.");
        };

        // --- TASK D: READER / NAVIGATOR THREAD ---
        // Reads range subsets (subMap) while writes are happening in real time
        Runnable readRangeTask = ()->{
            for(int i=0;i<5;i++){
                // Range query: Get all people with IDs between 50,000 and 60,000
                // .subMap() returns a thread-safe live view of that range
                var subMap = personMap.subMap(50_000, true, 60_000, true);
                System.out.println("[Reader Thread] Live check of sub-range [50k-60k] count: " + subMap.size());

                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // =========================================================================
        // STEP 4: EXECUTE ALL THREADS CONCURRENTLY
        // =========================================================================
        System.out.println("Starting concurrent multi-threaded operations...");
        executor.submit(insertTask);
        executor.submit(updateTask);
        executor.submit(removeTask);
        executor.submit(readRangeTask);

        // Shutdown thread pool and wait for all tasks to finish
        executor.shutdown();
        try {
            executor.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // =========================================================================
        // STEP 5: VERIFY FINAL STATE
        // Notice how the map remains clean, ordered, and valid throughout!
        // =========================================================================
        System.out.println("------------------------------------------------------------------");
        System.out.println("All threads finished processing.");
        System.out.println("Final Map Size: " + personMap.size());
        System.out.println("New Lowest Key: " + (!personMap.isEmpty() ? personMap.firstKey() : null) + " (Low IDs were removed)");
        System.out.println("New Highest Key: " + (!personMap.isEmpty() ? personMap.lastKey() : null) + " (High IDs were added)");

    }
}





















































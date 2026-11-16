package com.headeasylabs.collections.set;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedSetExample {
    public static void main(String[] args) throws InterruptedException {
        // 1. Create the thread-safe LinkedHashSet wrapper
        Set<String> syncSet = Collections.synchronizedSet(new LinkedHashSet<>());

        // 2. Set up a thread pool to simulate multiple threads accessing the set concurrently
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Task for Thread 1
        executor.submit(() -> {
            syncSet.add("Java");
            syncSet.add("Python");
            System.out.println(Thread.currentThread().getName() + " added initial languages.");
        });

        // Task for Thread 2
        executor.submit(() -> {
            syncSet.add("C++");
            syncSet.add("JavaScript");
            System.out.println(Thread.currentThread().getName() + " added web/system languages.");
        });

        // Task for Thread 3
        executor.submit(() -> {
            syncSet.add("Java"); // Duplicate entry, will be safely rejected
            syncSet.add("Rust");
            System.out.println(Thread.currentThread().getName() + " attempted duplicate and added Rust.");
        });

        // Shut down the pool and wait for all threads to finish their work
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

        // 3. CRUCIAL STEP: Manually synchronize on the collection while iterating
        System.out.println("\n--- Iterating over elements (Order Preserved) ---");
        synchronized (syncSet) {
            for (String language : syncSet) {
                System.out.println("Language: " + language);
            }
        }
        //-------------------------------Other 2 modern approaches-----------------------------------
        //------------1:---------------
        /*
        • Pros: Clean code; absolute zero thread-blocking during reads; perfect for listener lists or routing tables.
        • Cons: Massive performance penalty on writes. If you add 10,000 items, it copies the array 10,000 times.
        • Ordering Note: It preserves insertion order, just like LinkedHashSet
         */
        // Automatically thread-safe, no wrapper needed
        Set<String> cowSet = new CopyOnWriteArraySet<>();
        cowSet.add("Java");
        cowSet.add("Python");
        cowSet.add("C++");
        cowSet.add("Rust");
        cowSet.add("Java");

        // NO SYNCHRONIZED BLOCK NEEDED!
        // Safe to read even if another thread writes to it simultaneously
        for (String lang : cowSet) {
            System.out.println("Language-2: " + lang);
        }
        //------------2:---------------
        /*
• Pros: Holds the lock for the absolute minimum amount of time, preventing thread congestion.
• Cons: Minor memory overhead from creating a temporary snapshot list.
         */
        Set<String> syncSet2 = Collections.synchronizedSet(new LinkedHashSet<>());
        syncSet2.add("Java");
        syncSet2.add("Python");
        syncSet2.add("C++");
        syncSet2.add("Rust");
        syncSet2.add("Java");

        // 1. Local variable to hold the snapshot
        List<String> snapshot;

        // 2. Lock for a fraction of a millisecond just to copy the pointers
        synchronized (syncSet2) {
            snapshot = List.copyOf(syncSet2);
        } // The lock is released here!

        // 3. NO SYNCHRONIZED BLOCK NEEDED FOR THE LOOP
        // Other threads can freely modify syncSet while this loop runs
        for (String lang : snapshot) {
            System.out.println("Language-3: " + lang);
        }

    }
}


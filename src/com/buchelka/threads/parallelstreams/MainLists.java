package com.buchelka.threads.parallelstreams;

import java.util.concurrent.ConcurrentSkipListMap;
import java.util.stream.Stream;

public class MainLists {
    public static void main(String[] args) {

        var threadMap = new ConcurrentSkipListMap<String, Long>();

        var persons = Stream.generate(Person::new)
                .limit(10000)
                .parallel()
                .peek(p->{
                    var threadName = Thread.currentThread().getName()
                            .replace("ForkJoinPool.commonPool-worker-", "thread_");

                    threadMap.merge(threadName, 1L, Long::sum);

                })
                .toArray(Person[]::new);

        System.out.println(persons.length);

        System.out.println(threadMap);

        long total = 0;

        for(long count: threadMap.values()){
            total += count;
        }

        // Total number of unique worker threads used:
        int numberOfThreads = threadMap.size();
        System.out.println("Actual number of worker threads used: " + numberOfThreads);

// Total number of items processed across all threads:
        System.out.println("Total items processed: " + total); // 10000
    }
}

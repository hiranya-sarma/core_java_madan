package com.buchelka.threads.workstealing;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkStealingPoolDemo {

    public static void main(String[] args) {

        // 1. Create a work-stealing thread pool.
        // By default, this initializes a ForkJoinPool under the hood with a parallelism
        // level matching the number of available CPU cores on this machine.
        // Each thread gets its own private, double-ended task queue (deque).
        ExecutorService executor = Executors.newWorkStealingPool();

        System.out.println("Work-stealing pool initialized.");

        // 2. Prepare a list of independent tasks to submit.
        List<Callable<String>> tasks = new ArrayList<>();

        // We will create 10 image-processing tasks.
        // Notice that Task #3 is intentionally massive (takes 2 seconds),
        // while the others are very quick (100 milliseconds).

        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            tasks.add(() -> {
                String threadName = Thread.currentThread().getName();

                if (taskId == 3) {
                    // Simulate a huge, heavy task that will clog up this thread's queue.
                    // While this thread is stuck here, other idle threads will look at
                    // its queue and "steal" Tasks 4, 5, etc., from the back of it.
                    System.out.println("[" + threadName + "] Starting MASSIVE Image #" + taskId);
                    Thread.sleep(9000);
                } else {
                    // Simulate quick, normal tasks
                    System.out.println("[" + threadName + "] Processing standard Image #" + taskId);
                    Thread.sleep(100);
                }

                return "Result from Image #" + taskId + " processed by " + threadName;
            });
        }

        try {
            System.out.println("Submitting all tasks to the pool...\n");

            // 3. invokeAll() submits the entire collection of tasks at once.
            // The pool distributes these tasks across the private queues of the threads.
            // This call blocks until all tasks are completely finished.

            List<Future<String>> results = executor.invokeAll(tasks);

            System.out.println("\n--- All Tasks Complete! Printing Results ---");

            for( Future<String> result: results){
                System.out.println(result.get());
            }


        }catch (Exception e) {
            // Get and print the string returned by each individual task
            e.printStackTrace();
        }finally {
            // 4. Always shut down your executor services cleanly to release system resources.
            System.out.println("\nShutting down executor...");
            executor.shutdown();
        }

    }

}
































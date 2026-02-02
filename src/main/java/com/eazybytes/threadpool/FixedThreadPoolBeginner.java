package com.eazybytes.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolBeginner {
    public static void main(String[] args) {
        // Create thread pool of size 2
        ExecutorService executor =  Executors.newFixedThreadPool(2);

        //Submit 5 tasks
        for(int i = 1; i <=5; i++){
            int taskId = i;
            executor.submit(()->{
                System.out.println("Task id: "+taskId+
                        " executed by"+Thread.currentThread().getName()
                );
            });
        }

        //Graceful shutdown
        executor.shutdown();
    }
}

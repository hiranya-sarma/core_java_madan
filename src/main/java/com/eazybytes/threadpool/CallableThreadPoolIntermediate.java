package com.eazybytes.threadpool;

import java.util.concurrent.*;

public class CallableThreadPoolIntermediate {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<Integer> task = ()->{
           Thread.sleep(1000);
           return 42;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Doing other work...");

        Integer result = future.get(); //blocks

        System.out.println("Result "+result);

        executor.shutdown();
    }
}

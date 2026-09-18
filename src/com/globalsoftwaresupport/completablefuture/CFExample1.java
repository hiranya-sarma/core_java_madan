package com.globalsoftwaresupport.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CFExample1 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
       // supplyAsync() → runs task in ForkJoinPool.commonPool()
        //Main thread does NOT wait unless .get() is calle

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(()->{
            System.out.println("Running in: " + Thread.currentThread().getName());
            return 10+20;
        });
        System.out.println("Main thread continues...");
        Integer result = future.get();
        System.out.println("Result: " + result);


    }
}

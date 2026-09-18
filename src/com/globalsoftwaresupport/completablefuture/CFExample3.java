package com.globalsoftwaresupport.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CFExample3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture.supplyAsync(()->10)
                .thenApply(x->x*2)
                .thenApply(x->x+5)
                .thenAccept(x->{
                    System.out.println("Final Result: " +x);
                });
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

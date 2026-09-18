package com.globalsoftwaresupport.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CFExample2 {
    public static void main(String[] args) {

         CompletableFuture
                .supplyAsync(()->50)
                .thenAccept(result -> System.out.println("Result: " + result));

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

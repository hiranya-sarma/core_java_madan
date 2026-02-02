package com.eazybytes.thread;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashIntermediateExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> productCount = new ConcurrentHashMap<>();
        Set<String> activeUsers = ConcurrentHashMap.newKeySet();

        Thread producer = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                productCount.merge("Book",1, Integer::sum);
                activeUsers.add("User-"+i);
                sleep(100);
            }
        });

        Thread consumer = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                productCount.merge("Book",-1, Integer::sum);
                sleep(120);
            }
        });

        Thread monitor = new Thread(() -> {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Products: "+productCount);
                System.out.println("Users: "+activeUsers);
                sleep(150);
            }
        });
        producer.start();
        consumer.start();
        monitor.start();

        producer.join();
        consumer.join();
        monitor.join();

    }
    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {}
    }
}

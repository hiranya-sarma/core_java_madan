package com.eazybytes.thread;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashBeginnerExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> inventory = new ConcurrentHashMap<>();
        Set<String> users = ConcurrentHashMap.newKeySet();

        Thread t1 = new Thread(() -> {
            inventory.put("Apple", 10);
            users.add("Alice");
        });
        Thread t2 = new Thread(() -> {
            inventory.put("Banana", 20);
            users.add("Bob");
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Inventory: "+inventory);
        System.out.println("Users: "+users);

    }
}

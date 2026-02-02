package com.eazybytes.thread;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashAdvancedExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Long> eventCounter = new ConcurrentHashMap<>();
        Set<String> uniqueVisitors = ConcurrentHashMap.newKeySet();

        Runnable eventTask = () -> {
            for(int i = 0; i < 1000; i++) {
                 eventCounter.compute("CLICK", (k,v) ->v == null ? 1: v+1);
                 uniqueVisitors.add(Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(eventTask, "Visitor-A");
        Thread t2 = new Thread(eventTask, "Visitor-B");
        Thread t3 = new Thread(eventTask, "Visitor-C");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Event counter: " + eventCounter);
        System.out.println("UniqueVisitors: " + uniqueVisitors);
    }
}

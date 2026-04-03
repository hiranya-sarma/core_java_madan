package com.globalsoftwaresupport.concurrentmap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();

        Runnable task = ()->{
            for(int i=0;i<1000;i++){
                //map.put("key", map.getOrDefault("key", 0)+1);
                map.merge("key", 1, Integer::sum); // atomic operation
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final value: " + map.get("key"));
    }
}

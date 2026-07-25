package com.buchelka.threads.unsafehashmapdemo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UnsafeHashMapDemo {

    //Gemini
    public static void main(String[] args) {

        // Shared, non-thread-safe map
        //Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new ConcurrentHashMap<>();

        // Thread 1 inserts 1000 items (0 to 999)
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                map.put("T1_" + i, i);
            }
        });

        // Thread 2 inserts 1000 items (1000 to 1999)
        Thread t2 = new Thread(()->{
            for(int i=1000;i<2000;i++){
                map.put("T2_" + i, i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // EXPECTED: 2000
        // ACTUAL: Usually anywhere between 1200 and 1950 (or throws NullPointerException)
        System.out.println("Final map size: " + map.size());
    }

}

package com.globalsoftwaresupport.concurrentmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapProblem {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Runnable task = ()->{
            for(int i=0;i<1000;i++){
                map.put("key", map.getOrDefault("key", 0)+1);
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        System.out.println("Final value: " + map.get("key"));
    }
}

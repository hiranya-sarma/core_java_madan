package com.eazybytes.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        System.out.println(map);

        map.put("One", 10);
        map.put(null, null);
        map.put("Six", null);
        System.out.println(map);
        map.putIfAbsent("Four", 40);
        System.out.println(map);
    }
}

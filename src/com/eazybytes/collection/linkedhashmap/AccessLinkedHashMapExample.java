package com.eazybytes.collection.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccessLinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> wordNumberMapping = new LinkedHashMap<>();
        wordNumberMapping.put("One", 1);
        wordNumberMapping.put("Two", 2);
        wordNumberMapping.put("Three", 3);
        wordNumberMapping.put("Four", 4);
        wordNumberMapping.put("Five", 5);

        String key = "two";
        if (wordNumberMapping.containsKey(key))
        {
            System.out.println("Key exists in LinkedHashMap " + wordNumberMapping.get(key));
        }else {
            System.out.println("Key does not exist");
        }
        int value = 4;
        if (wordNumberMapping.containsValue(value))
        {
            System.out.println("Value exists in the LinkedHashMap");
        }else {
            System.out.println("Value does not exist");
        }
        wordNumberMapping.put("Three", 33);
        wordNumberMapping.put("Six", 6);
        System.out.println(wordNumberMapping);
    }
}

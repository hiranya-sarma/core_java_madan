package com.eazybytes.collection.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveFromLinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> wordNumberMapping = new LinkedHashMap<>();
        wordNumberMapping.put("One", 1);
        wordNumberMapping.put("Two", 2);
        wordNumberMapping.put("Three", 3);
        wordNumberMapping.put("Four", 4);
        wordNumberMapping.put("Five", 5);

        wordNumberMapping.remove("Two");
        System.out.println(wordNumberMapping);

        wordNumberMapping.remove("Two", 2);
        System.out.println(wordNumberMapping);

        wordNumberMapping.clear();
        System.out.println(wordNumberMapping);
    }
}

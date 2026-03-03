package com.eazybytes.collection.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class CreateLinkedHashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> wordNumberMapping = new LinkedHashMap<>();
        wordNumberMapping.put("One", 1);
        wordNumberMapping.put("Two", 2);
        wordNumberMapping.put("Three", 3);
        wordNumberMapping.put("Four", 4);
        wordNumberMapping.put("Five", 5); // will be updated to 55
        wordNumberMapping.put("Five", 55);
        wordNumberMapping.put("Six", 6); // will not be updated to 66
        wordNumberMapping.put("Seven", null); // will be updated to 7

        System.out.println(wordNumberMapping);
        wordNumberMapping.putIfAbsent("Six", 66);
        wordNumberMapping.putIfAbsent("Seven", 7);
        System.out.println(wordNumberMapping);
    }
}

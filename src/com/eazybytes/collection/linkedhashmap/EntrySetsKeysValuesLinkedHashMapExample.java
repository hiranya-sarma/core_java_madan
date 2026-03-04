package com.eazybytes.collection.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EntrySetsKeysValuesLinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> wordNumberMapping = new LinkedHashMap<>();
        wordNumberMapping.put("One", 1);
        wordNumberMapping.put("Two", 2);
        wordNumberMapping.put("Three", 3);
        wordNumberMapping.put("Four", 4);
        wordNumberMapping.put("Five", 5);

        //entrySet()
        Set<Map.Entry<String, Integer>> entries = wordNumberMapping.entrySet();
        System.out.println("Entry Set: "+entries);
        for(Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        //keys
        System.out.println("Keys: "+wordNumberMapping.keySet());
        //values
        System.out.println("Values: "+wordNumberMapping.values());

    }
}

package com.eazybytes.collection.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IterateLinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> wordNumberMapping = new LinkedHashMap<>();
        wordNumberMapping.put("One", 1);
        wordNumberMapping.put("Two", 2);
        wordNumberMapping.put("Three", 3);
        wordNumberMapping.put("Four", 4);
        wordNumberMapping.put("Five", 5);

        //1.
        System.out.println("============Lambda (commonly used)=============");
        wordNumberMapping.forEach((key, value) -> System.out.println(key + " -> " + value));

        //2.
        System.out.println("============entrySet=============");
        Set<Map.Entry<String, Integer>> entries = wordNumberMapping.entrySet();
        for(Map.Entry<String, Integer> entry: entries){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        //3.
        System.out.println("============entrySet iterator=============");
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        //4.
        System.out.println("============forEachRemaining=============");
        //below line will not work because of while loop above
       // iterator.forEachRemaining(entry -> System.out.println(entry.getKey()+" -> "+entry.getValue()));
        Iterator<Map.Entry<String, Integer>> iterator2 = entries.iterator();
        iterator2.forEachRemaining(entry -> System.out.println(entry.getKey()+" -> "+entry.getValue()));

    }
}

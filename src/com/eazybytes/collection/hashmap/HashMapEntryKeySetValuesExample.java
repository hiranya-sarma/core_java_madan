package com.eazybytes.collection.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValuesExample {
    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
         fruitMap.put("Apple", 10);
         fruitMap.put("Banana", 20);
         fruitMap.put("Orange", 15);
         //Entry Set
         Set<Map.Entry<String, Integer>> entrySet = fruitMap.entrySet();
         System.out.println("Entry Set (key-value) pairs: "+entrySet);
         //Key set
        Set<String> keys = fruitMap.keySet();
        System.out.println("Key Set: "+keys);
        //Values
        Collection<Integer> values = fruitMap.values();
        System.out.println("Values: "+values);

    }
}

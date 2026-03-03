package com.eazybytes.collection.hashmap;

import java.util.Iterator;
import java.util.Map;

public class IterateOverHashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> fruitMap = new java.util.HashMap<>();
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 20);
        fruitMap.put("Orange", 15);
        fruitMap.put("Mango", 25);

        //1.
        System.out.println("============keySet=============");
        for(String fruit: fruitMap.keySet()){
            System.out.println(fruit);
        }
        //2.
        System.out.println("============entrySet=============");
        for(Map.Entry<String, Integer> entry: fruitMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //3.
        System.out.println("============forEach=============");
        fruitMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        //4. Using iterator()
        System.out.println("============iterator=============");
        Iterator<Map.Entry<String, Integer>> iterator = fruitMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //5. Using for-each loop
        System.out.println("============for-each loop=============");
        for(Map.Entry<String, Integer> entry: fruitMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //6. another way to iterate over HashMap
        System.out.println("============another way to iterate over HashMap to get values=============");
        fruitMap.keySet().forEach(key -> System.out.println(fruitMap.get(key)));
    }
}

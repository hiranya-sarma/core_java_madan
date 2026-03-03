package com.eazybytes.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class AccessHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
        System.out.println("Is fruitMap empty? "+fruitMap.isEmpty());
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 20);
        fruitMap.put("Orange", 15);
        fruitMap.put("Mango", 12);
        System.out.println("Is fruitMap empty? "+fruitMap.isEmpty());

        System.out.println(fruitMap.size());
        System.out.println(fruitMap.containsKey("Apple"));
        System.out.println(fruitMap.containsValue(15));
        if(fruitMap.containsKey("banana")){
            System.out.println("Banana exists in the map");
        }else {
            System.out.println("Banana does not exist in the map");
        }
    }
}

package com.eazybytes.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ModifyAndRetrieveHashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 20);
        fruitMap.put("Orange", 15);

        if(fruitMap.containsKey("Apple")){
            System.out.println(fruitMap.get("Apple"));
        }
        if(fruitMap.containsValue(15)){
            System.out.println(fruitMap.get("Orange"));
        }

        fruitMap.put("Banana", 12);
        fruitMap.put("banana", 17);
        System.out.println(fruitMap);
    }
}

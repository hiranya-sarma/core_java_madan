package com.eazybytes.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeysFromHashmapExample {
    public static void main(String[] args) {
       Map<String, Integer> fruitMap = new HashMap<>();
       fruitMap.put("Apple", 10);
       fruitMap.put("Banana", 20);
       fruitMap.put("Orange", 15);

       Integer removedValue = fruitMap.remove("Apple");
       System.out.println("removed value: "+removedValue);
       System.out.println(fruitMap);
       System.out.println("remove NotExistingKey : " +fruitMap.remove("NotExistingKey"));

       boolean isRemoved = fruitMap.remove("Banana", 20);
       System.out.println("isRemoved: "+isRemoved);
       System.out.println(fruitMap);

        boolean isRemoved2 = fruitMap.remove("Orange", 20);
        System.out.println("isRemoved2: "+isRemoved2);
        System.out.println(fruitMap);


    }
}

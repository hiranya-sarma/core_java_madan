package com.eazybytes.collection.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class IterateOverTreeMapExample {
    public static void main(String[] args) {
        NavigableMap<String, Double> productPrices = new TreeMap<>();
        productPrices.put("Laptop", 80000.00);
        productPrices.put("Mobile", 50000.00);
        productPrices.put("Tablet-1", 60000.00);
        productPrices.put("TV", 150000.00);
        productPrices.put("Camera", 10000.00);
        System.out.println(productPrices);

        //1.
        System.out.println("============keySet=============");
        for(String product: productPrices.keySet()){
            System.out.println(product);
        }
        //2.
        System.out.println("============values=============");
        for(Double price: productPrices.values()){
            System.out.println(price);
        }
        //3.
        System.out.println("============entrySet=============");
        for(NavigableMap.Entry<String, Double> entry: productPrices.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //4.
        System.out.println("============forEach=============");
        productPrices.forEach((key, value) -> System.out.println(key + " : " + value));
        //5.
        System.out.println("============entrySet iterator=============");
        Iterator<Map.Entry<String, Double>> iterator = productPrices.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Double> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //6.
        System.out.println("============forEachRemaining=============");
        //below line will not work because of while loop above
       // iterator.forEachRemaining(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
        Iterator<Map.Entry<String, Double>> iterator2 = productPrices.entrySet().iterator();
        iterator2.forEachRemaining(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));



    }
}

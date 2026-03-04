package com.eazybytes.collection.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class RemoveEntriesFromTreeMapExample {
    public static void main(String[] args) {
        NavigableMap<String, Double> productPrices = new TreeMap<>();
        productPrices.put("Laptop", 80000.00);
        productPrices.put("Mobile", 50000.00);
        productPrices.put("Tablet-2", 60000.00);
        productPrices.put("TV", 150000.00);
        productPrices.put("Camera", 10000.00);
        System.out.println(productPrices);

        productPrices.remove("TV");
        productPrices.remove("Tablet-2", 60000.00);
        System.out.println(productPrices);

        Map.Entry<String, Double> pollFirstEntry = productPrices.pollFirstEntry();
        System.out.println("After pollFirstEntry: "+pollFirstEntry.getKey() + " : " + pollFirstEntry.getValue());
        System.out.println(productPrices);

        Map.Entry<String, Double> pollLastEntry = productPrices.pollLastEntry();
        System.out.println("After pollLastEntry: "+pollLastEntry.getKey() + " : " + pollLastEntry.getValue());
        System.out.println(productPrices);

    }
}

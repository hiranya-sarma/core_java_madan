package com.eazybytes.collection.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class AccessTreeMapExample {
    public static void main(String[] args) {
        NavigableMap<String, Double> productPrices = new TreeMap<>();
        productPrices.put("Laptop", 80000.00);
        productPrices.put("Mobile", 50000.00);
        productPrices.put("Tablet", 60000.00);
        productPrices.put("TV", 150000.00);
        productPrices.put("Camera", 10000.00);
        System.out.println(productPrices);

        String key = productPrices.firstKey();
        System.out.println(key);
        System.out.println(productPrices.get(key));

        key = productPrices.lastKey();
        System.out.println(key);

        String key2 = "Tablet";
        if (productPrices.containsKey(key2))
        {
            System.out.println("Key exists in TreeMap " + productPrices.get(key2));
        }else {
            System.out.println("Key does not exist");
        }
        double value = 60000.00;
        if (productPrices.containsValue(value))
        {
            System.out.println("Value exists in the TreeMap");
        }

        Map.Entry<String, Double> firstEntry = productPrices.firstEntry();
        System.out.println("First product: "+firstEntry.getKey() + " : " + firstEntry.getValue());

        Map.Entry<String, Double> lastEntry = productPrices.lastEntry();
        System.out.println("Last product: "+lastEntry.getKey() + " : " + lastEntry.getValue());

        Map.Entry<String, Double> higerEntry = productPrices.higherEntry("Tablet");
        //To avoid null pointer exception as TV, Tablet
        if(higerEntry != null) {
            System.out.println("Higher entry: "+higerEntry.getKey() + " : " + higerEntry.getValue());
        }else {
            System.out.println("No higher entry");
        }

        Map.Entry<String, Double> lowerEntry = productPrices.lowerEntry("Tablet");
        if(lowerEntry != null) {
            System.out.println("Lower entry: "+lowerEntry.getKey() + " : " + lowerEntry.getValue());
        }else {
            System.out.println("No lower entry");
        }


    }
}

package com.eazybytes.collection.treeset;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDescendingOrderExample {
    public static void main(String[] args) {

        SortedSet<String> fruits = new TreeSet<>(Collections.reverseOrder());
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Strawberry");
        System.out.println(fruits);
        SortedSet<String> fruits2 = new TreeSet<>();
        fruits2.add("Banana");
        fruits2.add("Apple");
        fruits2.add("Orange");
        fruits2.add("Mango");
        fruits2.add("Pineapple");
        fruits2.add("Strawberry");
        System.out.println(fruits2);
    }
}

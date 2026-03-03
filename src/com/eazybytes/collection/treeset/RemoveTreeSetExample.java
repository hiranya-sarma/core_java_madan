package com.eazybytes.collection.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class RemoveTreeSetExample {
    public static void main(String[] args) {

        NavigableSet<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");
        System.out.println("Before remove(): "+fruits);
        fruits.remove("Apple");
        System.out.println("After remove(): "+fruits);
        fruits.pollFirst();
        System.out.println("After pollFirst(): "+fruits);
        fruits.pollLast();
        System.out.println("After pollLast(): "+fruits);
        fruits.removeIf(fruit -> fruit.startsWith("A"));
        System.out.println("After removeIf(): "+fruits);
        fruits.clear();
        System.out.println("After clear: "+fruits);
    }
}

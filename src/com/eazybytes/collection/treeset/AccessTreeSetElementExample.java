package com.eazybytes.collection.treeset;

import java.util.NavigableSet;

import java.util.TreeSet;

public class AccessTreeSetElementExample {
    public static void main(String[] args) {

        NavigableSet<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Strawberry");
        fruits.add("Cherry");
        fruits.add("Grapes");
        fruits.add("Watermelon");
        System.out.println(fruits);
        System.out.println("first element: "+fruits.first());
        System.out.println("second element: "+fruits.last());

        System.out.println("size: "+fruits.size());
        System.out.println("isEmpty: "+fruits.isEmpty());
        System.out.println("contains: "+fruits.contains("Apple"));
        System.out.println("containsAll: "+fruits.containsAll(fruits));
        System.out.println("subSet: "+fruits.subSet("Apple","Watermelon"));
        System.out.println("headSet: "+fruits.headSet("Watermelon"));
        System.out.println("tailSet: "+fruits.tailSet("Watermelon"));
        System.out.println(fruits);
        System.out.println("elements higher than Watermelon: "+fruits.higher("Watermelon"));
        System.out.println("elements lower than Watermelon: "+fruits.lower("Watermelon"));
    }
}

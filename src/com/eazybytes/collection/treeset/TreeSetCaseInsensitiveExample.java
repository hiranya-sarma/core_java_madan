package com.eazybytes.collection.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCaseInsensitiveExample {
    public static void main(String[] args) {
        SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Papaya");
        fruits.add("Peach");
        fruits.add("Strawberry");
        fruits.add("Kiwi");
        fruits.add("Watermelon");
        System.out.println(fruits);

        fruits.add("apple");
        fruits.add("banana");
        System.out.println(fruits);
    }
}

package com.eazybytes.collection.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class CreateTreeSetExample {
    public static void main(String[] args) {

        SortedSet<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Pineapple");
        System.out.println(fruits);

        fruits.add("banana"); //lowercase but will be added, same for HashSet
        System.out.println(fruits);
      //  fruits.add(null); //null not allowed, null pointer exception
      //  System.out.println(fruits);


    }
}

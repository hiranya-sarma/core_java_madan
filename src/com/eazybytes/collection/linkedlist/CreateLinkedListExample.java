package com.eazybytes.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample {
    public static void main(String[] args) {

        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("LinkedList after add(): "+fruits);

        fruits.add(1,"Mango");
        System.out.println("LinkedList after add(index,element): "+fruits);

        fruits.addFirst("Pineapple");
        System.out.println("LinkedList after addFirst(): "+fruits);

        fruits.addLast("Grapes");
        System.out.println("LinkedList after addLast(): "+fruits);

        List<String> moreFruits = new LinkedList<>();
        moreFruits.add("Orange");
        moreFruits.add("Watermelon");
        fruits.addAll(moreFruits);
        System.out.println("LinkedList after addAll(): "+fruits);
    }
}

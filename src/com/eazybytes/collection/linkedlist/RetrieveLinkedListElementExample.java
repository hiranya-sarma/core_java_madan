package com.eazybytes.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class RetrieveLinkedListElementExample {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("LinkedList: "+fruits);
        System.out.println("First element: "+fruits.getFirst());
        String lastFruit = fruits.getLast();
        System.out.println("Last element: "+lastFruit);

        String orangeFruit = fruits.get(3);
        System.out.println("Orange fruit: "+ orangeFruit);


    }
}

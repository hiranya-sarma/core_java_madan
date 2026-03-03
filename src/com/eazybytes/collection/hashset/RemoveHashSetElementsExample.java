package com.eazybytes.collection.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveHashSetElementsExample {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.remove(2);
        System.out.println("Removed (2): "+numbers);

        //removeAll()
        List<Integer> perfectSquare = new ArrayList<>();
        perfectSquare.add(1);
        perfectSquare.add(4);
        numbers.removeAll(perfectSquare);
        System.out.println("Removed (1,4): "+numbers);
        //removeIf()
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println("After removeIf() (even): "+numbers);
        //remove all elements
        numbers.clear();
        System.out.println("Cleared: "+numbers);

    }
}

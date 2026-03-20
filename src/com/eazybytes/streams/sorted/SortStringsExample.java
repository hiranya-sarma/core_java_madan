package com.eazybytes.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsExample {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");

        List<String> result = fruits.stream()
                .sorted() // Natural Order Alphabetically
                .toList();

        System.out.println("Natural order: "+result);

        List<String> result2 = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Reverse order: "+result2);
    }
}

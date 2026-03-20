package com.eazybytes.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedNumberExample {
    public static void main(String[] args) {

        List<Integer> unsortedNumbers = Arrays.asList(10, 5, 20, 15, 30);

        List<Integer> result1 = unsortedNumbers.stream()
                .sorted() //natural order
                .toList();

        System.out.println("Natural order: "+result1);

        List<Integer> result2 = unsortedNumbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Reversed order: "+result2);
    }
}

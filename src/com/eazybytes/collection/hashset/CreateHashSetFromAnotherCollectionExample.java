package com.eazybytes.collection.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromAnotherCollectionExample {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        Set<Integer> set1 = new HashSet<>(list1);
        set1.addAll(list2);
        System.out.println(set1);

    }
}

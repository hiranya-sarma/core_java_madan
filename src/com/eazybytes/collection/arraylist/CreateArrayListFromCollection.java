package com.eazybytes.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateArrayListFromCollection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> list2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));

        List<Integer> list3 = new ArrayList<>(list1);
        list3.addAll(list2);
        System.out.println(list3);
    }
}

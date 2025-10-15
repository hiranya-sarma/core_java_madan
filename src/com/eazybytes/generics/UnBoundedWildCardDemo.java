package com.eazybytes.generics;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardDemo {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("One", "Two", "Three");
        printList(strList);
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        printList(intList);
    }

    public static void printList(List<?> list) {
        for(Object obj: list) {
            System.out.println(obj);
    }
    }
}

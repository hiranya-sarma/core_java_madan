package com.eazybytes.streams;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class CreateStreamExample {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        List<String> strList = asList("Ramesh", "Ravi", "Rajesh");

        numList.stream().forEach(System.out::println);
        System.out.println("==========================");
        strList.stream().forEach(System.out::println);
        System.out.println("==========================");





    }
}

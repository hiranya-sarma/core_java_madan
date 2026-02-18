package com.eazybytes.streams;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class CreateStreamExample {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        List<String> strList = asList("Ramesh", "Ravi", "Rajesh");

        numList.stream().forEach(System.out::println);
        System.out.println("==========================");
        strList.stream().forEach(System.out::println);
        System.out.println("==========Set================");

        //Create Stream from Set
        List<String> fruitList = List.of("Apple", "Banana", "Mango","Orange");
        Set<String> fruitSet = new HashSet<>(fruitList);
        Stream<String> stream1= fruitSet.stream();
        stream1.forEach(System.out::println);
        System.out.println("===========Map===============");
        //Create Stream from Map, Map does not have Stream method
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Ramesh", 20);
        fruitMap.put("Ravi", 21);
        fruitMap.put("Rajesh", 22);
        fruitMap.put("Rahul", 23);
        fruitMap.entrySet().stream();
        Stream<Map.Entry<String, Integer>> stream2 = fruitMap.entrySet().stream();
        stream2.forEach(System.out::println);

        //Create Stream from Map's keyset
        Stream<String> stream3 = fruitMap.keySet().stream();
        stream3.forEach(System.out::println);
        Stream<Integer> stream4 = fruitMap.values().stream();
        stream4.forEach(System.out::println);
        System.out.println("===============Iterate================");
        fruitMap.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}

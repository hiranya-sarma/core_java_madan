package com.eazybytes.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapExample {
    public static void main(String[] args) {
        //source
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");

        Stream<String> fruitStream = fruits.stream();

        List<String> fruitList= fruitStream
                .peek(e-> System.out.println("Before mapping: "+e))
                .map(fruit -> fruit.toUpperCase())
                .peek(e-> System.out.println("After mapping: "+e))
                .toList();

        System.out.println(fruitList);


    }
}

package com.eazybytes.streams.map;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample2 {
    public static void main(String[] args) {
        //source
        List<String> listOfSrings = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

       List<Integer> listOfIntegers = listOfSrings.stream().map(el->Integer.valueOf(el)).toList();

       System.out.println(listOfIntegers);
    }
}

package com.eazybytes.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Traditional way
       List<Integer> evenNumbers = new ArrayList<>();
       for(Integer num: numbers){
           if(num %2 == 0){
               evenNumbers.add(num);
           }
       }
       System.out.println(evenNumbers);
       //Stream way
        List<Integer> evenNumbers2 = numbers.stream().filter(num -> num %2 == 0).toList();
        System.out.println(evenNumbers2);

    }
}

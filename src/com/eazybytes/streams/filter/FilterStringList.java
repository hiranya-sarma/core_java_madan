package com.eazybytes.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringList {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");

        List<String> filteredFruits = new ArrayList<>();

        for(String fruit : fruits){
            if(fruit.equals("Banana")){
                filteredFruits.add(fruit);
            }
        }
        System.out.println(filteredFruits);

        //Using Stream API
        List<String> filteredFruits1 = fruits.stream().filter(fruit -> fruit.equals("Banana")).toList();
        System.out.println(filteredFruits1);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers = numbers.stream().filter(num -> num %2 == 0).toList();
        System.out.println(evenNumbers);
    }
}

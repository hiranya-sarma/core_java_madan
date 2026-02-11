package com.eazybytes.functional;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> addition = (num1, num2)-> num1 + num2;

        int result = addition.apply(20,10);
        System.out.println(result);
    }
}

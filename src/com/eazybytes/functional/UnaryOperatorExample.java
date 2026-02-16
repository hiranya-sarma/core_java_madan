package com.eazybytes.functional;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        UnaryOperator<Integer> square = i -> i * i;

        int result = square.apply(5);
        System.out.println(result);

        UnaryOperator<String> trim = s -> s.trim();

        UnaryOperator<String> toUpperCase = s -> s.toUpperCase();

        String result2 = trim.andThen(toUpperCase).apply("   Ramesh   ");
        System.out.println(result2);
    }
}

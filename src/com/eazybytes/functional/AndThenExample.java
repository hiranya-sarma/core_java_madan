package com.eazybytes.functional;

import java.util.function.Function;

public class AndThenExample {
    public static void main(String[] args) {

        Function<String, String> upperCase = s -> s.toUpperCase();

        Function<String, Integer> strLen = s -> s.length();

        int len = upperCase.andThen(strLen).apply("Ramesh");

        System.out.println(len);
    }
}

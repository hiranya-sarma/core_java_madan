package com.eazybytes.functional;

import java.util.function.BiPredicate;

public class BiPredicateTestExample {
    public static void main(String[] args) {

        BiPredicate<String, String> isEqual = (str1, str2)-> str1.equals(str2);

        boolean result = isEqual.test("Ramesh", "Ramesh2");

        System.out.println(result);
    }
}

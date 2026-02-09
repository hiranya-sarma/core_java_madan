package com.eazybytes.functional;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
    public static void main(String[] args) {

        Predicate<String> isJava = Predicate.isEqual("Java");

        boolean result = isJava.test("Java11");

        System.out.println(result);



    }
}

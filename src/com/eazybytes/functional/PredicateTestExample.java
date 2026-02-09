package com.eazybytes.functional;

import java.util.function.Predicate;

public class PredicateTestExample {
    public static void main(String[] args) {

        Predicate<String> isNullOrEmpty = s -> s == null || s.isEmpty();
        System.out.println(isNullOrEmpty.test(""));

        Predicate<Integer> isGreaterThan10 = i -> i > 10;
        System.out.println(isGreaterThan10.test(9));


    }
}

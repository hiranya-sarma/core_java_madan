package com.eazybytes.functional;

import java.util.function.Predicate;

public class PredicateAndExample {
    public static void main(String[] args) {

        Predicate<String> isNullOrEmpty = s -> s == null || s.isEmpty();
        Predicate<String> isEmpty = s -> !s.isEmpty();

        Predicate<String> hasMoreThanFiveChars = str-> str.length() > 5;

        Predicate<String> isValid = isNullOrEmpty.and(hasMoreThanFiveChars);

        boolean result1 = isValid.test("Hello world");
        System.out.println(result1);
        System.out.println("----------------------------------------------");
        Predicate<String> isValid2 = isEmpty.and(hasMoreThanFiveChars);
        boolean result2 = isValid2.test("Hello world");
        System.out.println(result2);


    }
}

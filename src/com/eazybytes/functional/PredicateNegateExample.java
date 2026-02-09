package com.eazybytes.functional;

import java.util.function.Predicate;

public class PredicateNegateExample {
    public static void main(String[] args) {

        Predicate<String> isEmpty = s -> s.isEmpty();

        Predicate<String> isNotEmpty = isEmpty.negate();

        boolean result = isNotEmpty.test(" "); // "space is not counted as empty
        System.out.println(result);



    }
}

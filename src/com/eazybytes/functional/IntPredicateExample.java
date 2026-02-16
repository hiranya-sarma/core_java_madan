package com.eazybytes.functional;

import java.util.function.IntPredicate;

public class IntPredicateExample {
    public static void main(String[] args) {

//        Predicate<Integer> isEven = i -> i % 2 == 0;
//
//        System.out.println(isEven.test(2));

        IntPredicate isEven1 = i -> i % 2 == 0;

        System.out.println(isEven1.test(2));
    }
}

package com.eazybytes.functional;

import java.util.function.BiPredicate;

public class BiPredicateAndExample {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> isGreaterThan10 = (num1, num2)-> num1 > 10 && num2 > 10;

        BiPredicate<Integer, Integer> isPositive = (num1, num2)-> num1 > 0 && num2 > 0;

        boolean result = isPositive.and(isGreaterThan10).test(20, 20);
        System.out.println(result);

        //using or
        boolean result2 = isPositive.or(isGreaterThan10).test(20, -10);
        System.out.println(result2);

        //using negate
        boolean result3 = isPositive.negate().test(20, -10);
        System.out.println(result3);
    }
}

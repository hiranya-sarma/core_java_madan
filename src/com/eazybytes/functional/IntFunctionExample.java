package com.eazybytes.functional;

import java.util.function.IntFunction;

public class IntFunctionExample {
    public static void main(String[] args) {

        /*
        Function<Integer, String> intToString = i -> "Number is: " + i;
        System.out.println(intToString.apply(10));
        */
        IntFunction<String> intToString1 = i -> "Number is: " + i;
        System.out.println(intToString1.apply(11));



    }
}

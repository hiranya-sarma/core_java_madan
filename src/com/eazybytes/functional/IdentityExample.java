package com.eazybytes.functional;

import java.util.function.Function;

public class IdentityExample {
    public static void main(String[] args) {

        Function<String, String> identity = Function.identity();

        String result = identity.apply("Ramesh1");
        System.out.println(result);
    }
}

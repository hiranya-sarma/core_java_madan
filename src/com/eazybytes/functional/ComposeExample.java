package com.eazybytes.functional;

import java.util.function.Function;

public class ComposeExample {
    public static void main(String[] args) {

        Function<String, String> upperCase = s -> s.toUpperCase();
        Function<String, String> trim = s -> s.trim();

        Function<String, String> trimThenUppercase = upperCase.compose(trim);

        String result = trimThenUppercase.apply("   Ramesh   ");
        System.out.println(result);
        System.out.println(result.length());
    }
}

package com.eazybytes.functional;

import java.util.function.LongFunction;

public class LongFunctionExample {
    public static void main(String[] args) {

        LongFunction<Double> areaOfCircle = radius -> Math.PI * radius * radius;

        double result = areaOfCircle.apply(10L);
        System.out.println(result);
    }
}

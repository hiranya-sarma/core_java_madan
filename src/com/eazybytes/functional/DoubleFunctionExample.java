package com.eazybytes.functional;

import java.util.function.DoubleFunction;

public class DoubleFunctionExample {
    public static void main(String[] args) {
        DoubleFunction<Double> calculateDiscount = price -> 0.80 * price;

        double result = calculateDiscount.apply(250.75);
        System.out.println(result);
    }
}

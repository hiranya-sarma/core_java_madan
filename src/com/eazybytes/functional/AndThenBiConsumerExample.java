package com.eazybytes.functional;

import java.util.function.BiConsumer;

public class AndThenBiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> printNumbers = (num1, num2) -> System.out.println("Numbers are: "+num1+" , " + num2);

        BiConsumer<Integer, Integer> printSum = (num1, num2) -> System.out.println("Sum is: "+(num1+num2));

        printNumbers.andThen(printSum).accept(10, 20);
    }
}

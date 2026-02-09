package com.eazybytes.functional;

import java.util.function.Consumer;

public class PrintConsumerExample {
    public static void main(String[] args) {

        Consumer<String> printConsumer = s-> System.out.println(s);

        printConsumer.accept("Hello World");

        Consumer<String> printUpperCaseConsumer = s -> System.out.println("Uppercase "+s.toUpperCase());

        printConsumer.andThen(printUpperCaseConsumer).accept("Hello");


    }
}

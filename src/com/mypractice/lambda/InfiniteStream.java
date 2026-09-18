package com.mypractice.lambda;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {

        Stream.generate(() -> "Hello")
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(0, i->i+1)
                .limit(10)
                .forEach(System.out::println);

        IntStream.iterate(5, i-> i-1)
                .limit(20)
                .forEach(System.out::println);
    }
}

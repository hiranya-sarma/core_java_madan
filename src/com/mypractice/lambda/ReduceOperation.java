package com.mypractice.lambda;

import java.util.stream.Stream;

public class ReduceOperation {

    public static void main(String[] args) {

        Integer sum = Stream.of(7,64,8,67).reduce(0,(a, b) -> a + b);

        System.out.println(sum);
    }
}

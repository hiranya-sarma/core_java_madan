package com.eazybytes.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
//        BiFunction<String, String, String> concat = (str1, str2) -> str1 +" " +str2;
//
//        String result = concat.apply("Jon", "Doe");
//        System.out.println(result);

        BinaryOperator<String> concat1 = (str1, str2) -> str1 +" " +str2;

        String result1 = concat1.apply("Jon", "Doe1");
        System.out.println(result1);

        List<Integer> l1 = List.of(1, 2, 3, 4, 5);
        List<Integer> l2 = List.of(6, 7, 8, 9, 10);

        BinaryOperator<List<Integer>> merged = (list1, list2) -> {
            List<Integer> list3= new ArrayList<>(list1);
            list3.addAll(list2);
            return list3;
        };
        List<Integer> result2 = merged.apply(l1, l2);
        System.out.println(result2);
    }
}

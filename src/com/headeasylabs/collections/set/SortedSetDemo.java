package com.headeasylabs.collections.set;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {

        Set<Integer> numbers1 = new TreeSet<>();
        numbers1.add(50);
        numbers1.add(10);
        numbers1.add(40);
        numbers1.add(20);
        numbers1.add(30);

        System.out.println(numbers1);
        // [10, 20, 30, 40, 50]
        SortedSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        //[10, 20, 30, 40, 50]
        System.out.println(numbers.first());
        // 10

        System.out.println(numbers.last());
       // 50

        System.out.println(numbers.headSet(40));
       // [10, 20, 30]

    }
}

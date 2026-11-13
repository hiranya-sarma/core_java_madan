package com.headeasylabs.set;

import java.util.*;

public class NavigableSetDemo {
    public static void main(String[] args) {

        Set<Integer> numbers1 = new TreeSet<>();
        numbers1.add(50);
        numbers1.add(10);
        numbers1.add(40);
        numbers1.add(20);
        numbers1.add(30);

        System.out.println(numbers1);

//        NavigableSet<Integer> numbers = new TreeSet<>();
//        numbers.add(50);
//        numbers.add(10);
//        numbers.add(40);
//        numbers.add(20);
//        numbers.add(30);
        NavigableSet<Integer> numbers = new TreeSet<>(
                Arrays.asList(10, 20, 30, 40, 50)
        );
        System.out.println(numbers.lower(30)); //Strictly less
        System.out.println(numbers.floor(30)); //Inclusive
        System.out.println(numbers.ceiling(30)); //Inclusive
        System.out.println(numbers.higher(30));  //Strictly greater

        //What if we search for 35, which doesn't exist?
        System.out.println(numbers.lower(35));   // 30
        System.out.println(numbers.floor(35));   // 30
        System.out.println(numbers.ceiling(35)); // 40
        System.out.println(numbers.higher(35));  // 40

        System.out.println("----------------Inclusive range operations---------------------------");
        System.out.println(numbers.subSet(20, true, 50, true));
       // [20, 30, 40, 50]

        System.out.println(numbers.headSet(40, true));
      // [10, 20, 30, 40]

        System.out.println(numbers.tailSet(40, false));
        // [50, 60]

        System.out.println(numbers);

        System.out.println(numbers.first());
        // 10

        System.out.println(numbers.last());
       // 50

        System.out.println(numbers.headSet(40));
       // [10, 20, 30]

    }
}

package com.mypractice.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Alice", "Bob", "David");

        Spliterator<String> spliterator = names.spliterator();
        boolean isOrdered = spliterator.hasCharacteristics(Spliterator.ORDERED);
        System.out.println(isOrdered);

     //   spliterator.forEachRemaining(System.out::println);

        //process one element at a time
       // spliterator.tryAdvance(System.out::println);
       // spliterator.tryAdvance(System.out::println);
      //  spliterator.tryAdvance(System.out::println);
       // spliterator.tryAdvance(System.out::println);
       // System.out.println("=============================");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Spliterator<Integer> s1 = numbers.spliterator();

        Spliterator<Integer> s2 = s1.trySplit();

        s1.forEachRemaining(System.out::println);
        System.out.println("=============================");
        s2.forEachRemaining(System.out::println);




    }
}

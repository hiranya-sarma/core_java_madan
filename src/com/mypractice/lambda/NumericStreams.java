package com.mypractice.lambda;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreams {

    public static void main(String[] args) {

        List<Book> list = new ArrayList<>();

        list.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        list.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        list.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        list.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));

        OptionalDouble average= list.stream()
                .map(book-> book.getRating())
                .mapToDouble(rating -> rating)
                .average();
        System.out.println(average.getAsDouble());

        OptionalDouble average2= list.stream()
                .mapToDouble(book-> book.getRating())
                .average();
        System.out.println(average2.getAsDouble());

        //map : Objects

        //mapToDouble : primitive double
        IntStream intS = IntStream.of(1,2,3,4,5);
        DoubleStream doubleS = DoubleStream.of(1,3,5,8);
        LongStream longS = LongStream.of(1L,3L,5L,8L);

        Stream<Integer> boxedInts = intS.boxed();
        doubleS.mapToObj(value -> value).forEach(System.out::println);

        OptionalInt maxOptional = IntStream.of(1,2,3).max();
        System.out.println(maxOptional.getAsInt());

        IntSummaryStatistics stats = IntStream.of(1,2,3,4,5).summaryStatistics();
        System.out.println(stats);



    }
}

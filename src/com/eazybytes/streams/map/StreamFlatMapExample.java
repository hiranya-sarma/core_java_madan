package com.eazybytes.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Converting a stream of streams into a stream of elements
// Converting Nested lists into a single list
public class StreamFlatMapExample {
    public static void main(String[] args) {

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        Stream<List<Integer>> listOfStream = listOfLists.stream();

        Stream<Integer> flattenedStream = listOfStream.flatMap(list -> list.stream()) //Stream<Stream<Integer>> -> Stream<Integer>
                .distinct();

        System.out.println(flattenedStream.toList());

        //Collecting nested arrayas into a single list
        String[][] nestedArray = new String[][]{
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"}
        };
        Stream<String> flattenedStream2 = Arrays.stream(nestedArray).flatMap((strArray) -> Arrays.stream(strArray));
        System.out.println(flattenedStream2.toList());
    }
}

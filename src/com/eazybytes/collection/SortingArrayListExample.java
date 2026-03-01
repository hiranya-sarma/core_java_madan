package com.eazybytes.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArrayListExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Collections.sort(numbers);
        System.out.println("Ascending sort: "+numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending sort: "+numbers);

        numbers.sort(Comparator.naturalOrder());
        System.out.println("Natural sort: "+numbers);

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Pearl");

        Collections.sort(programmingLanguages);
        System.out.println("Ascending sort: "+programmingLanguages);

        Collections.sort(programmingLanguages, Collections.reverseOrder());
        System.out.println("Descending sort: "+programmingLanguages);
    }
}

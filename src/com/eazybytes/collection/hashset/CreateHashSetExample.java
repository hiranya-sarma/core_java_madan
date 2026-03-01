package com.eazybytes.collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
    public static void main(String[] args) {
        Set<String> daysOfWeek = new HashSet<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        System.out.println(daysOfWeek);

        //Handle duplicates
        daysOfWeek.add("Monday"); //will be ignored
        System.out.println(daysOfWeek);
        //handle null values
        daysOfWeek.add(null);
        daysOfWeek.add(null); //will be ignored
        System.out.println(daysOfWeek);


    }
}

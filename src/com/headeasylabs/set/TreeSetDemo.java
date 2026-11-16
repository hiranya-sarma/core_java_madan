package com.headeasylabs.set;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();
        //TreeSet ts1 = new TreeSet(Comparator c);

        SortedSet s = new TreeSet();
        TreeSet ts2 = new TreeSet(s);

        HashSet hs = new HashSet();
        TreeSet ts3 = new TreeSet(hs);

        TreeSet<Integer> ts4 = new TreeSet<>();


        /*
        When you pass custom objects into a Java TreeSet, the class of those objects must provide a way to compare them.
        Since a TreeSet automatically sorts its elements, it will throw a ClassCastException at runtime if it doesn't know
        how to order your custom objects
         */

        TreeSet<Employee> ts5 = new TreeSet();
        ts5.add(new Employee("John", 30000));

        TreeSet<Integer> data = new TreeSet<>(new MySorting());
        // TreeSet data = new TreeSet(new MySorting()); //same output

        data.add(152);
        data.add(185);
        data.add(254);
        data.add(10);
        data.add(132);
        data.add(10);

        System.out.println(data);

    }
}

























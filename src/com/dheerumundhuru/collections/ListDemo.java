package com.dheerumundhuru.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ListDemo {

    public static void arrayListDemo() {

        //Collection<Integer> list1 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(); // same output
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(3);
        list1.add(null);
        list1.add(null);

        //list1.getFirst(); //in List

        list1.remove(3);
        System.out.println("list1 "+list1);

        list1.remove(3);
        System.out.println("list1 "+list1);

    }

    public static void main(String[] args) {
       arrayListDemo();
    }
}

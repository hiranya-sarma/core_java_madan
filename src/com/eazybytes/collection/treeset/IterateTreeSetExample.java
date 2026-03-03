package com.eazybytes.collection.treeset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class IterateTreeSetExample {
    public static void main(String[] args) {

        NavigableSet<String> fruits = new TreeSet<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pineapple");
        //1.
        for(String fruit: fruits){
          //  System.out.println(fruit);
        }
        //2.
        fruits.forEach(System.out::println);
        //3.
        System.out.println("============Iterator=========");
        Iterator<String> iteratorList= fruits.iterator();
        while(iteratorList.hasNext()){
            System.out.println(iteratorList.next());
        }
        //4.
        System.out.println("===========descendingIterator===========");
        Iterator<String> iteratorList2= fruits.descendingIterator();
        while(iteratorList2.hasNext()){
            System.out.println(iteratorList2.next());
        }
        //6. simplemently use lambda expression
        System.out.println("===========lambda expression===========");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}

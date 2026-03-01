package com.eazybytes.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingOverLinkedListExample {
    public static void main(String[] args) {
       // List<String> fruits = new LinkedList<>();
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Orange");
        fruits.add("Grapes");
        //1.
        for(int i=0; i<fruits.size(); i++){
          //  System.out.println(fruits.get(i));
        }
        //2.
        for(String fruit: fruits){
         //   System.out.println(fruit);
        }
        //3.
        // fruits.forEach(System.out::println);

        //4. Iterator
        Iterator<String> iteratorList= fruits.iterator();
//        while(iteratorList.hasNext()){
//            System.out.println(iteratorList.next());
//        }
        //5.
        Iterator<String> iteratorList2= fruits.iterator();
       // iteratorList2.forEachRemaining(System.out::println);
      //  iteratorList2.forEachRemaining((fruit)-> System.out.println(fruit));

        //6.Using descendingIterator() to iterate over linkedList in reverse order
        Iterator<String> descendingIterator = fruits.descendingIterator();
        while(descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }

        System.out.println("\n using java 8 forEach and lambda expression");
        fruits.forEach((fruit)-> System.out.println(fruit));
    }
}

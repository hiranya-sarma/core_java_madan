package com.eazybytes.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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
        System.out.println("\n-----------------------------------------------\n");

        LinkedList<String> questions = new LinkedList<>();
        questions.add("Question 1");
        questions.add("Question 2");
        questions.add("Question 3");
        questions.add("Question 4");
        questions.add("Question 5");
        System.out.println("Original Questions:");
        questions.forEach(System.out::println);

        // Iterator starts at beginning
        ListIterator<String> iterator = questions.listIterator();
        // Move iterator to Question 3
        while (iterator.hasNext()) {
            String current = iterator.next();
            if(current.equals("Question 3")){
                // Insert immediately after Question 3
                iterator.add("New Question 3A");
                // Move to next element (Question 4)
                if (iterator.hasNext()) {
                    String next = iterator.next();
                    iterator.remove();
                }
                break;
            }
        }
        System.out.println("\nAfter modifications:");
        questions.forEach(System.out::println);

    }
}









































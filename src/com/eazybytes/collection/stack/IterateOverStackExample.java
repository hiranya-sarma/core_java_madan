package com.eazybytes.collection.stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class IterateOverStackExample {
    public static void main(String[] args) {
        //LIFO
        Stack<String> stackOfPlates = new Stack<>();
        stackOfPlates.push("Plate 1");
        stackOfPlates.push("Plate 2");
        stackOfPlates.push("Plate 3");
        stackOfPlates.push("Plate 4");
        stackOfPlates.push("Plate 5");
        System.out.println(stackOfPlates);
        //1.
        System.out.println("============for loop=============");
        for(String plate: stackOfPlates){
            System.out.println(plate);
        }
        //2.
        System.out.println("============forEach=============");
        stackOfPlates.forEach(plate -> System.out.println(plate));
        //3.
        System.out.println("============Iterator=============");
        Iterator<String> iteratorList= stackOfPlates.iterator();
        while(iteratorList.hasNext()){
            System.out.println(iteratorList.next());
        }
        //4. forEachRemaining()
        System.out.println("============forEachRemaining=============");
        Iterator<String> iteratorList2= stackOfPlates.iterator();
        iteratorList2.forEachRemaining(System.out::println);
        //5. listIterator()
        /*
        * Stack.listIterator():
            -Comes from Vector
            -Returns a ListIterator
            -Allows forward and backward traversal
            -Can modify elements while iterating
            -Treats stack like a list indexed structure
        * */
        System.out.println("============listIterator=============");
        Iterator<String> listIterator = stackOfPlates.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("============listIterator reverse traversal=============");
        ListIterator<String> it = stackOfPlates.listIterator(stackOfPlates.size());
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }

        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("Go");

        ListIterator<String> it2 = stack.listIterator();
        System.out.println("============Modifying Stack with listIterator=============");
        while(it2.hasNext()){
            String lang = it2.next();
            if(lang.equals("Python")){
                it2.set("Python 3");
            }
        }
        System.out.println(stack);

    }
}

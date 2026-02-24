package com.eazybytes.methodreference;

import java.util.*;
import java.util.function.Function;

@FunctionalInterface
interface Printable{
    void print(String msg);
}

public class MethodReferenceDemo {

    static Integer square(int x) {
        return x * x;
    }

    void display(String msg) {
        msg = msg.toUpperCase();
        System.out.println(msg);
    }
    public static void main(String[] args) {

        Function<Integer, Integer> square = x -> MethodReferenceDemo.square(x);
        int result = square.apply(5);
        System.out.println(result);

        //1.Method Reference
        Function<Integer, Integer> square1 = MethodReferenceDemo::square;
        System.out.println(square1.apply(6));

        System.out.println("-------------------------------------------------------------");
        //2.Method Reference to instance method of an object
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
        //lambda expression
        Printable printable = (msg) -> methodReferenceDemo.display(msg);
        printable.print("hello world 1");

        //3
        Function<String, String> strToUpper = (input) -> input.toUpperCase();
        System.out.println(strToUpper.apply("hello world 2"));
        //using method reference
        Function<String, String> strToUpper1 = String::toUpperCase;
        System.out.println(strToUpper1.apply("hello world 3"));

        String[] strArray = {"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};

        Arrays.sort(strArray, (s1, s2) -> s1.compareToIgnoreCase(s2));
        Arrays.sort(strArray, String::compareToIgnoreCase);

        //4 reference to a constructor
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Mango", "Banana"));
        System.out.println(fruits);
        Function<List<String>, Set<String>> distinctFruits = (fruitList) -> new HashSet<>(fruitList);
        System.out.println(distinctFruits.apply(fruits));

        //method reference
        Function<List<String>, Set<String>> setMethodReference = HashSet::new;
        System.out.println(setMethodReference.apply(fruits));







    }
}

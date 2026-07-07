package com.holczer.gemini.wildcrds;


import java.util.ArrayList;
import java.util.List;

class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}


public class Main {


//    public static void printAnimals(List<Animal> animals){
//        for(Animal a : animals){
//            System.out.println(a);
//        }
//
//    }

//    public static void printAnimals(List<?> animals){
//        for(Object a : animals){
//            System.out.println(a);
//        }
//
//    }
public static void printAnimals(List<? extends Animal> animals){
    for(Animal a : animals){
        System.out.println(a);
    }

}

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        printAnimals(dogs);
        List<?> list = new ArrayList<Integer>();
       // list.add(1);
        System.out.println(list);
    }

}

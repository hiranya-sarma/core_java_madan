package com.eazybytes.marvel.app;

import com.eazybytes.marvel.base.Animal;

public class AnimalUtility {

    public static void printName(Animal animal) {
        System.out.println("Animal name is " + animal.getName());
        animal.eat();
    }
}

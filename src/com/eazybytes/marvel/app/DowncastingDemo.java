package com.eazybytes.marvel.app;

import com.eazybytes.marvel.animals.Cat;
import com.eazybytes.marvel.animals.Dog;
import com.eazybytes.marvel.base.Animal;

public class DowncastingDemo {
    public static void main(String[] args) {
        Animal anm = new Animal();

        Dog dog = new Dog();
        anm = dog; //upcasting

        dog = (Dog)anm;
       // dog.eat();
        AnimalUtility.performAction(anm);
        if (anm instanceof Cat) {
            Cat cat = (Cat)anm;
        }

    }
}

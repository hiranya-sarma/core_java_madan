package com.animatedguide.generics;

public class Dog<T> extends Animal {
    private T name;

    public Dog(T name){
        this.name = name;
    }

    @Override
    public void makeSound(){
        System.out.println("woof!, woof!");
    }

    public void display(){
        System.out.println("Dog's name "+name);
    }
}

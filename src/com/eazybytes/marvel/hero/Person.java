package com.eazybytes.marvel.hero;

public interface Person {

    static void main1(String[] args) {
        System.out.println("Hello world from from interfaces");
    }
    default void walk() {
        System.out.println("Walking");
    }

}

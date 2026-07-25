package com.animatedguide.exceptiondemo.finaldemo;

//@FunctionalInterface
public interface IC extends IA, IB{

    void display();

    default void methodD() {
        System.out.println("Method D");
    }

    static void methodE() {
        System.out.println("Method E");
    }

}

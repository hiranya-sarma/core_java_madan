package com.eazybytes.methodreference;

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
        printable.print("hello world");









    }
}

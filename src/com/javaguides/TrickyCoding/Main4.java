package com.javaguides.TrickyCoding;

public class Main4 {
    public static void main(String[] args) {

        String s = "hello"; // string-constant pool
        s.concat(" world"); // hello world-GC
        System.out.println(s); // prints "hello" only

        s = s.concat(" world");
        System.out.println(s);// prints "hello world"


    }
}

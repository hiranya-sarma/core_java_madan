package com.javaguides.TrickyCoding;

public class Main3 {
    public static void main(String[] args) {

        //-128 to 127
        //cache integer object

        Integer a = 100;
        Integer b = 100;

        //two seperate objects
        Integer x = 200;
        Integer y = 200;

        System.out.println(a == b);
        System.out.println(a == x);
        System.out.println(x == y);

    }
}

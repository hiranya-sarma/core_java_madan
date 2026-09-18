package com.buchelka.section10.autoboxing;

public class Main {
    public static void main(String[] args) {
        Integer myIntValue = 56;
        int myInt = myIntValue;
        System.out.println(myInt);
    }

    private static int returnAnInt(Integer i){
        return i;
    }
}

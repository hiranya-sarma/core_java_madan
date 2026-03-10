package com.in28minutes.generics;

import java.util.Arrays;
import java.util.List;

public class GenericRunner {

    //Generic Method
    static <X> X doubleValue(X value) {
        return value;
    }



    public static void main(String[] args) {

        MyCustomList<String> customList = new MyCustomList<>();
        customList.addElement("Apple");

        MyCustomList<Integer> customList2 = new MyCustomList<>();
        customList2.addElement(1);

        System.out.println(customList);
        System.out.println(customList2);
        System.out.println(customList.get(0));

        String str = doubleValue("Apple");
        Integer intVal = doubleValue(1);
        List<String> fruits = doubleValue(Arrays.asList("Apple", "Banana", "Orange"));

    }
}

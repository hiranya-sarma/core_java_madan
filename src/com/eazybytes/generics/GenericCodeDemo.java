package com.eazybytes.generics;

public class GenericCodeDemo {
    public static void main(String[] args) {
      GenericPair<String, Integer> stringIntPair = new GenericPair<>("Hello", 10);
      stringIntPair.setFirst("Another String");
      stringIntPair.setSecond(123);
      String str = stringIntPair.getFirst();
      Integer intObj = stringIntPair.getSecond();
     System.out.println(str);
     System.out.println(intObj);
     String[] strArray = {"Hello1", "World1"};
     printArray(strArray,"another type string");
     Integer[] intArray = {1, 2, 3};
     printArray(intArray, "another type integer");
    }

    public static <T,U> void printArray(T[] array, U u){
        for(T item : array){
            System.out.println(item);
            System.out.println(u);
        }

    }
}

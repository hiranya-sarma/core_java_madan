package com.animatedguide.exceptiondemo.unchecked;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program started");

        int[] arr = {1, 2, 3, 4, 5};

      //  System.out.println(arr[5]);

        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Error occurred");
        }

        System.out.println("Program ended");


    }
}

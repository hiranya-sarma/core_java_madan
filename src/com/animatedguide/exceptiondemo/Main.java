package com.animatedguide.exceptiondemo;

import com.animatedguide.exceptiondemo.finaldemo.BlankFinalDemo;

public class Main {
    public static void main(String[] args) {

       // ExceptionPropagationDemo.methodA();
       System.out.println("Program started in main() method");
        try {
            ExceptionPropagationDemo.methodA();
        } catch (Exception e) {
            System.out.println("Exception caught in main() method: " + e.getMessage());
        }

        BlankFinalDemo blankFinalDemo = new BlankFinalDemo("Model-1");
        blankFinalDemo.display();

        System.out.println("Program ended in main() method");

/*
        System.out.println("Program started");
        try {
            int result = 10/0;
            String str = null;
            str.length();
        }catch (Exception e) {
            System.out.println("Exception caught: "+e.getClass());
            System.out.println("Exception message: "+e.getMessage());
            e.printStackTrace();
        }

        Object str[] = {"a", "b", "c"};
        str[1] = 1;

        Object str2[] = new String[2];
        str2[1] = 1;

        System.out.println("Program ended");
        */
    }
}

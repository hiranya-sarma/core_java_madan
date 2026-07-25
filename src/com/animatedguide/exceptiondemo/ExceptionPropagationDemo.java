package com.animatedguide.exceptiondemo;

public class ExceptionPropagationDemo {

    public static void methodA() throws Exception {
        System.out.println("Starting Method A...!");
        methodB();
//        try {
//            methodB();
//        } catch (Exception e) {
//           // e.printStackTrace();
//            System.out.println("Exception caught in Method A: " + e.getMessage());
//        }
        System.out.println("Ending Method A...!");

    }

    public static void methodB() throws Exception {
        System.out.println("Starting Method B...!");
        methodC();
        System.out.println("Ending Method B...!");

    }

    public static void methodC() throws Exception {
        System.out.println("Starting Method C...!");
        throw new Exception("Exception thrown in Method C");
       // System.out.println("Ending Method C...!");

    }
}

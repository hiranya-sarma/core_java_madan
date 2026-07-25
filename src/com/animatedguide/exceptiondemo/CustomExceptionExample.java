package com.animatedguide.exceptiondemo;

public class CustomExceptionExample {

    public static void setAge(int age)throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age must be greater than 18 : "+age);
        }
    }

    public static void main(String[] args) {

        try {
            setAge(2);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age exception caught");
          //  e.printStackTrace();
        }
       // setAge(19); //if extends RuntimeException then it will be caught by JVM
    }
}

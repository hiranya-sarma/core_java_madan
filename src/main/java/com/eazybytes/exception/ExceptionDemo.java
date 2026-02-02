package com.eazybytes.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        /*******************************ArithmeticException*****************************************/
        try {
            int a = 10;
            int b = 0;

            int result = a/b;

        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }finally {
            System.out.println("This always executed");
        }
        /*****************************unchecked*******************************************/
        try {
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of range!");
        }
        /**********************checked**************************************************/
        try {
            FileReader fileReader = new FileReader("myfile.txt");
        }catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
    }
}

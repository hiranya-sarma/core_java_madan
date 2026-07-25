package com.animatedguide.exceptiondemo.checked;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program started");

        File file = new File("test.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (Exception e) {
            System.out.println("Error occurred");

        }
        System.out.println("Program ended");


    }
}

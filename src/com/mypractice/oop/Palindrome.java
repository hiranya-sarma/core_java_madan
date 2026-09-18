package com.mypractice.oop;

public class Palindrome {

    public static void main(String[] args) {

        String str = "madam";

        System.out.println(str.equals(new StringBuilder(str).reverse().toString()));

    }
}

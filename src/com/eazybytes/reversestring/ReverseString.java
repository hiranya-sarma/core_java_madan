package com.eazybytes.reversestring;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversed = "";



        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);
    }
}

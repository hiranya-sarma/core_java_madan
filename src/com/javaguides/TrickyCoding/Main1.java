package com.javaguides.TrickyCoding;

public class Main1 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s3 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s1);
        System.out.println("------------------------");
        s2 = s2.intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s1);
    }
}

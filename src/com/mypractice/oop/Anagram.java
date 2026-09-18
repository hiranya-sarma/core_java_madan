package com.mypractice.oop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        System.out.println("isAnagram "+isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2) {
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}

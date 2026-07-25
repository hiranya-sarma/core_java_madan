package com.interviewninja;

public class Main {
    public static void main(String[] args) {

        /*
        int num = 10;
        double numDouble = num;
        System.out.println(numDouble);

        double largeNum = 10.99;
        int numInt = (int)largeNum;
        System.out.println(numInt);

         */
        /*
        String str = "Hello";
        str = " World";
        //str = str.concat(" World");
        System.out.println(str);

         */

        StringBuilder sb = new StringBuilder("Hello");
        int originalHash = System.identityHashCode(sb);
         sb.append(" World");
        int originalHash2 = System.identityHashCode(sb);

        System.out.println(originalHash);
        System.out.println(originalHash2);
        System.out.println(originalHash == originalHash2);
        System.out.println(sb);
    }
}

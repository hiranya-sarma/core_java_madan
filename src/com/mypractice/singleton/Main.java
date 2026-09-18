package com.mypractice.singleton;

public class Main {
    public static void main(String[] args) {
        MySingleton ob11 = MySingleton.getInstance();
        MySingleton ob12 = MySingleton.getInstance();
        System.out.println(ob11 == ob12);
    }
}

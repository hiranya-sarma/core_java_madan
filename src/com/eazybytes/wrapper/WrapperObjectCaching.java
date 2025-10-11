package com.eazybytes.wrapper;

public class WrapperObjectCaching {
    public static void main(String[] args) {
        Integer obj1 = 16;
        Integer obj2 = 16;
        System.out.println("obj1 == obj2 : " + (obj1 == obj2));
        System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2));
        Integer obj3 = 161;
        Integer obj4 = 161;
        System.out.println("obj3 == obj4 : " + (obj3 == obj4));
        System.out.println("obj3.equals(obj4) : " + obj3.equals(obj4));

        Integer obj5 = new Integer(16);
        Integer obj6 = new Integer(16);
        System.out.println("obj5 == obj6 : " + (obj5 == obj6));
        System.out.println("obj5.equals(obj6) : " + obj5.equals(obj6));
    }
}

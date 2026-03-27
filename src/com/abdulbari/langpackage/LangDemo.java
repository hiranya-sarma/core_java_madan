package com.abdulbari.langpackage;


class MyObject {

}

public class LangDemo {
    public static void main(String[] args) {
        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();

        System.out.println(o1 == o2);
        System.out.println(o1.equals(o2));

        System.out.println((o1.hashCode() == o2.hashCode()) +" "+o1.hashCode() +" "+ o2.hashCode());
    }
}

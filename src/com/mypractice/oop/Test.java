package com.mypractice.oop;


class Student {
    int id;
}
public class Test {
    public static void main(String[] args) {
        Student x = new Student();
        x.id = 1;
        fun(x);
        System.out.println(x.id);

    }
    static void fun(Student a){
        Student student = new Student();
        student.id = 2;
        a = student;

    }
}

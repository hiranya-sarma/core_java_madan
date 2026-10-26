package com.javaguides.TrickyCoding;

//Java is always pass-by-value, never pass-by-reference.
/*
But the confusion comes because objects look like pass-by-reference,
while actually Java passes the value of the reference, not the reference itself.
---------------------------------------------------------------------------------------------------
Remember this rule:

Java passes object references by value, not objects by reference.

When you pass an object to a method, Java copies the reference value into the parameter.

Modifying the referenced object's state can be visible to the caller.
Reassigning the parameter does not change the caller's reference.
Java does not support pass-by-reference in the sense of allowing a method to replace the caller's local variable directly.

This distinction is fundamental to understanding Java method arguments, object references, and memory behavior.
 */
class Test {
    int x = 10;
}

class User {
    int id;
}

public class Main5 {

    public static void change(Test t) {
        t.x = 20;
    }

    static void change2(User u) {
        u = new User();
        u.id = 50;
        System.out.println("inside change2 method "+u.id);
    }

    public static void main(String[] args) {
        Test obj = new Test();
        change(obj);
        System.out.println(obj.x);
        System.out.println("------------------------");
        User u = new User();
        u.id = 10;
        change2(u);
        System.out.println(u.id);
    }
}

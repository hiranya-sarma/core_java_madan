package com.javaguides.TrickyCoding;

class User2 {
    int id;

    User2(int id) {
        this.id = id;
    }
}

public class Main51 {

    static void change(User2 u1, User2 u2) {
        u1.id = 100;

        u1 = u2;

        u1.id = 200;

        u2 = new User2(300);
        u2.id = 400;
    }

    public static void main(String[] args) {
        User2 u1 = new User2(10);
        User2 u2 = new User2(20);

        change(u1, u2);

        System.out.println(u1.id);
        System.out.println(u2.id);
    }
}

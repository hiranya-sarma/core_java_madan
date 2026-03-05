package com.eazybytes.streams.sorted;

class User{
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "User {name=" + name + ", age=" + age + "}";
    }

}
public class SortUserExample {
    public static void main(String[] args) {

    }
}

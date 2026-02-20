package com.eazybytes.streams;

import java.util.ArrayList;
import java.util.List;

class User{
    private int id;
    private String username;
    private String password;
    private String email;

    User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
    }
}

public class MapCustomObjectExample {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ramesh", "123456", "ramesh@example.com"));
        users.add(new User(2, "Ravi", "123456", "ravi@example.com"));
        users.add(new User(3, "Rajesh", "123456", "rajesh@example.com"));
        users.add(new User(4, "Rahul", "123456", "rahul@example.com"));

        List<String> emailIds = users.stream().map(user ->user.getEmail()).toList();
        System.out.println(emailIds);
    }
}

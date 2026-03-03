package com.eazybytes.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

class Employee{
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    Employee(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Employee {id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "}";
    }
}
public class HashMapUserDefinedExample {
    public static void main(String[] args) {
        Map<Integer, Employee> employees = new HashMap<>();
        employees.put(1, new Employee(1, "Ramesh", "Kumar", "r@t.com"));
        employees.put(2, new Employee(2, "John", "Motson", "jm@ea.com"));
        System.out.println(employees);
    }
}

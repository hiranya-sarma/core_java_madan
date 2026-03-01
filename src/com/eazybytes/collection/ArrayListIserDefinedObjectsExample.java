package com.eazybytes.collection;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public String toString() {
            return "Employee {id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "}";
    }
}

public class ArrayListIserDefinedObjectsExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ramesh", "Kumar", "ramesh@bac.com"));
        employees.add(new Employee(2, "John", "Motson", "john@easports.com"));

        employees.forEach((employee) -> System.out.println(employee));
    }
}

package com.eazybytes.collection.treeset;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return Integer.compare(this.id, otherEmployee.id);
    }

    @Override
    public String toString() {
        return "Employee {id=" + id + ", name=" + name + "}";
    }
}
public class TreeSetUserDefinedObjectsExample {
    public static void main(String[] args) {
        SortedSet<Employee> employees = new TreeSet<>();
        employees.add(new Employee(1, "Ramesh"));
        employees.add(new Employee(2, "John"));
        employees.add(new Employee(4, "Hari"));
        employees.add(new Employee(5, "Anil"));
        employees.add(new Employee(3, "Ravi"));

        System.out.println(employees);

        SortedSet<Employee> employees2 = new TreeSet<>(Comparator.comparing(Employee::getName));
        employees2.add(new Employee(1, "Ramesh"));
        employees2.add(new Employee(2, "John"));
        employees2.add(new Employee(4, "Hari"));
        employees2.add(new Employee(5, "Anil"));
        employees2.add(new Employee(3, "Bipin"));

        System.out.println(employees2);

    }
}

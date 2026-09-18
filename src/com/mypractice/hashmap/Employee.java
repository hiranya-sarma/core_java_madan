package com.mypractice.hashmap;

import java.util.HashMap;
import java.util.Map;

class Employee {


    int id;

    Employee(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return 10;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

class Main{
    public static void main(String[] args) {
        Map<Employee,String> map = new HashMap<>();

        Employee e1 = new Employee(101);

        map.put(e1, "John");
        map.put(e1, "David");

        System.out.println(map.size());
        System.out.println(map.get(e1));

    }
}











































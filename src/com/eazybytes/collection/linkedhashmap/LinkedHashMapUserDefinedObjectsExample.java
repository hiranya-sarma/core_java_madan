package com.eazybytes.collection.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class Todo{
    private int id;
    private String name;
    private String description;

    Todo(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return id == todo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

public class LinkedHashMapUserDefinedObjectsExample {
    public static void main(String[] args) {
        Map<Integer, Todo> todos = new LinkedHashMap<>();
        todos.put(1, new Todo(1, "Learn Java", "Learn Java basics"));
        todos.put(2,new Todo(2, "Learn Spring", "Learn Spring basics"));
        System.out.println(todos);
    }
}

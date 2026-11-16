package com.headeasylabs.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Set<String> languages = new LinkedHashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java"); // Duplicate is ignored

        // Preserves insertion order: [Java, Python, C++]
        System.out.println(languages);

        // Common operations
        boolean hasPython = languages.contains("Python"); // true
        languages.remove("C++");
        int count = languages.size(); // 2
        System.out.println(count);
    }
}

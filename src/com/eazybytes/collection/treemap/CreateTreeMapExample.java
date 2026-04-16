package com.eazybytes.collection.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class CreateTreeMapExample {
    public static void main(String[] args) {
        SortedMap<String, String> fileExtensions = new TreeMap<>();
        fileExtensions.put("python",".py");
        fileExtensions.put("c++",".cpp");
        fileExtensions.put("kotlin",".kt");
        fileExtensions.put("golang",".go");
        fileExtensions.put("java",".java");
        System.out.println(fileExtensions);

        SortedMap<String, Integer> map1 = new TreeMap<>();
        map1.put("One", 1);
        map1.put("Two", 2);
        map1.put("Three", 3);
        map1.put("Four", 4);
        map1.put("Five", 5);
        System.out.println(map1);
    }
}

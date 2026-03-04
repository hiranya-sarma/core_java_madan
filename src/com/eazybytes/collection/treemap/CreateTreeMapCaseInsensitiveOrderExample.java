package com.eazybytes.collection.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class CreateTreeMapCaseInsensitiveOrderExample {
    public static void main(String[] args) {
        SortedMap<String, String> fileExtensions = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        fileExtensions.put("python",".py");
        fileExtensions.put("Python",".py");
        fileExtensions.put("c++",".cpp");
        fileExtensions.put("kotlin",".kt");
        fileExtensions.put("golang",".go");
        fileExtensions.put("java",".java");
        System.out.println(fileExtensions);
    }
}

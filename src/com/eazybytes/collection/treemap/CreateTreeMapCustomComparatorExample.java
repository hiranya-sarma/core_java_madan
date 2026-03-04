package com.eazybytes.collection.treemap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class CreateTreeMapCustomComparatorExample {
    public static void main(String[] args) {

        SortedMap<String, String> fileExtensions = new TreeMap<>(Comparator.reverseOrder());
        fileExtensions.put("python",".py");
        fileExtensions.put("c++",".cpp");
        fileExtensions.put("kotlin",".kt");
        fileExtensions.put("golang",".go");
        fileExtensions.put("java",".java");
        System.out.println(fileExtensions);
    }
}

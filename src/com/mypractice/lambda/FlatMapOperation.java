package com.mypractice.lambda;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapOperation {
    public static void main(String[] args) {

        Path p = Path.of("/home/hiranya/PROJECTS/Zips&Backups/HeadEasyLab/The Notebook");

        try(Stream<String> notebook = Files.lines(p)) {
          List<String> collect = notebook.flatMap(lines-> Arrays.stream(lines.split(" "))).collect(Collectors.toList());
          collect.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

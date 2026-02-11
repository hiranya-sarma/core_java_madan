package com.eazybytes.functional;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer<String, String> fullName = (str1, str2) -> System.out.println("Full name: "+str1 +" "+ str2);

        fullName.accept("John", "Smith");
    }
}

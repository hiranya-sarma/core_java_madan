package com.eazybytes.functional;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierGetExample {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello World!";
        String result = supplier.get();
        System.out.println(result);

        Supplier<LocalDateTime> dateTimeSupplier = () -> LocalDateTime.now();

        LocalDateTime dateTime = dateTimeSupplier.get();
        System.out.println(dateTime);
    }
}

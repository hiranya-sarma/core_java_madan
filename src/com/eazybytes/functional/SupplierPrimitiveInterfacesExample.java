package com.eazybytes.functional;

import java.util.function.*;

public class SupplierPrimitiveInterfacesExample {
    public static void main(String[] args) {

        /*
        Supplier<Integer> intSupplier = () -> 10;
        int result = intSupplier.get();
        System.out.println(result);
         */

        IntSupplier intSupplier = () -> 10;
        int result = intSupplier.getAsInt();
        System.out.println(result);

        LongSupplier timestampSupplier = () -> System.currentTimeMillis();
        long result2 = timestampSupplier.getAsLong();
        System.out.println(result2);

        DoubleSupplier doubleSupplier = () -> 10.5;
        double result3 = doubleSupplier.getAsDouble();
        System.out.println(result3);


    }
}

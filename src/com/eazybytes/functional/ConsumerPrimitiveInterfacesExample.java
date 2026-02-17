package com.eazybytes.functional;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerPrimitiveInterfacesExample {
    public static void main(String[] args) {

//        Consumer<Integer> printValue = i -> System.out.println("Consme integer:"+i);
//        printValue.accept(10);

        IntConsumer printValue = i -> System.out.println("Consme integer:"+i);
        printValue.accept(10);

        LongConsumer printValue1 = longVal -> System.out.println("Consme long:"+longVal);
        printValue1.accept(10L);

        DoubleConsumer printValue2 = doubleVal -> System.out.println("Consme double:"+doubleVal);
        printValue2.accept(10.5);

    }
}

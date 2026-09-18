package com.buchelka.oops.section7;

public class StringBuilderDemo {

//    String helloWorld = "Hello " + " World";
//    StringBuilder helloWorldBuilder = new StringBuilder("Hello " + " World");
    public static void main(String[] args) {

        //StringBuilderDemo stringBuilderDemo = new StringBuilderDemo();

//        printInformaton(stringBuilderDemo.helloWorld);
//        printInformaton(stringBuilderDemo.helloWorldBuilder);

        String helloWorld = "Hello" + " World";
        String bye = helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        //printInformaton(helloWorld);
        printInformaton(bye);
        printInformaton(helloWorldBuilder);
        System.out.println("-----------------------------");

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformaton(emptyStart);
        printInformaton(emptyStart32);


    }

    public static void printInformaton(String string) {
        System.out.println("String = " + string);
        System.out.println("String length = " + string.length());

    }

    public static void printInformaton(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("StringBuilder length = " + builder.length());
        System.out.println("StringBuilder capacity = " + builder.capacity());

    }
}

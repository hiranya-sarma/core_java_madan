package com.eazybytes.app;

abstract class AbstractClass {
    abstract void display();
}

class OuterClass {
    private String outerField = "Outer field";
    private static String staticOuterField = "Static Outer field";

    class InnerClass {
        public void display() {
            System.out.println(outerField); // Accessing outer class field
        }
    }

    static class StaticInnerClass {
        public void display() {
            System.out.println(staticOuterField); // Accessing static outer class field
        }
    }

    void display() {
        final String message = "Hello from method-local inner class";

        class MethodLocalInnerClass {
            void printMessage() {
                System.out.println(message);
            }
        }

        MethodLocalInnerClass inner = new MethodLocalInnerClass();
        inner.printMessage();
    }
}
package com.eazybytes.multithreading;

public class RaceconditionDemo {

    private static class SharedClass {
        int a = 0;
        int b = 0;

        public void method1() {
            int local1 = a;
            this.b = 1;
            System.out.println("local1 "+local1);
        }

        public void method2() {
            int local2 = b;
            this.a = 2;
            System.out.println("local2 "+local2);
        }
    }

    public static void main(String[] args) {

        SharedClass sharedClass = new SharedClass();

        Thread thread1 = new Thread(() -> sharedClass.method1());
        Thread thread2 = new Thread(() -> sharedClass.method2());

        thread1.start();
        thread2.start();

    }
}

/*
Your selected answer is correct because it highlights how the two methods can execute instructions in a non-dependent manner, allowing for different
possible interleavings. This capability of thread execution can indeed lead to a scenario where local1 is 2 and local2 is 1, demonstrating the unpredictable
nature of data races in concurrent programming. Great job understanding this complex concept!

 */



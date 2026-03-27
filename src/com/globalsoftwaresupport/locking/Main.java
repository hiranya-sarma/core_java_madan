package com.globalsoftwaresupport.locking;

public class Main {
    public static void main(String[] args) {
        SharedResource obj1 = new SharedResource();
        SharedResource obj2 = new SharedResource();

        Thread t1 = new Thread(()->obj1.objectMethod(), "T1");
        Thread t2 = new Thread(()->obj1.objectMethod(), "T2");

        Thread t3 = new Thread(()->obj2.objectMethod(), "T3");

        Thread t4 = new Thread(()->SharedResource.classMethod(), "T4");
        Thread t5 = new Thread(()->SharedResource.classMethod(), "T5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        //Output:Note: order can vary — this is multithreading)
       /*
       *    T1 entered objectMethod
            T3 entered objectMethod
            T4 entered classMethod
            T1 exiting objectMethod
            T2 entered objectMethod
            T3 exiting objectMethod
            T4 exiting classMethod
            T5 entered classMethod
            T2 exiting objectMethod
            T5 exiting classMethod
            *
            *
            t4 vs t5 (class-level lock)
            * Both use same class lock (SharedResource.class)
            * T4 enters
              T4 exits
              T5 enters
              T5 exits
              Always sequential
              *
              * Object vs Class lock interaction

                👉 Do they block each other?
                ❌ NO
                objectMethod() → locks obj1 / obj2
                classMethod() → locks SharedResource.class
                👉 Different locks
                ✔ They run simultaneously
                *
                * Final Behavior Summary
                    Threads	     Lock Type	       Blocking?
                    t1 vs t2	Same object	        ✅ Yes
                    t1 vs t3	Different objects	❌ No
                    t4 vs t5	Class lock	        ✅ Yes
                    t1 vs t4	Object vs Class	    ❌ No
                    *
                    *
                    If interviewer asks:
                    Can static synchronized and non-static synchronized block each other?
                    ✔ Correct answer:
                    No, because they lock different monitors — one locks the instance (this) and the other locks the class (ClassName.class).
                    *
                    * 2.Object-level locking using block

                        Equivalent to:

                        public synchronized void method() { }

                        is:

                        public void method() {
                            synchronized(this) {
                                // object-level lock
                            }
                        }
                        * Behavior
                            this = current object
                            Same object → blocking
                            Different objects → parallel

                        ✔ Same as synchronized method
                        *
                        *3. Class-level locking using block

                        Equivalent to:

                        public static synchronized void method() { }

                        is:

                        public static void method() {
                            synchronized(SharedResource.class) {
                                // class-level lock
                            }
                        }

            *
            * 4. Full Combined Example (Block version)
            * class SharedResource {

            // Object-level lock
            public void objectMethod() {
                synchronized(this) {
                    System.out.println(Thread.currentThread().getName() + " object lock");
                    try { Thread.sleep(2000); } catch(Exception e){}
                }
            }

            // Class-level lock
            public static void classMethod() {
                synchronized(SharedResource.class) {
                    System.out.println(Thread.currentThread().getName() + " class lock");
                    try { Thread.sleep(2000); } catch(Exception e){}
                }
            }
        }
        * 🚨 5. SUPER IMPORTANT: You can lock ANY object

            This is where power (and danger) comes.

            Example 1: Custom object lock
            class Test {
                private final Object lock = new Object();

                public void method() {
                    synchronized(lock) {
                        // only threads using SAME lock object will block
                    }
                }
            }
            Example 2: WRONG locking (common mistake)
            synchronized(new Object()) {
                // ❌ useless lock
            }

            👉 Why wrong?

            Every time → new object
            No sharing → no locking

            ✔ Threads won't block each other

            🔥 6. Mixing different locks (interview gold)
            class Test {

                private final Object lock1 = new Object();
                private final Object lock2 = new Object();

                public void method1() {
                    synchronized(lock1) {
                        System.out.println("method1");
                    }
                }

                public void method2() {
                    synchronized(lock2) {
                        System.out.println("method2");
                    }
                }
            }

            👉 Even on SAME object:

            ✔ method1 and method2 can run in parallel
            (because different locks)

            🧩 7. Key Comparison
            Type	               Code	                             Lock
            Object method	     synchronized	                     this
            Class method	     static synchronized	             ClassName.class
            Block (object)	     synchronized(this)	                 current object
            Block (class)	     synchronized(ClassName.class)	     class
            Custom lock	         synchronized(lock)	                 custom object
            🎯 8. Final Mental Model

            Think like this:

            Lock depends on OBJECT, not METHOD

            Two threads will block only if:

            ✔ They use SAME lock object

            💡 9. Interview one-liner

            Synchronized blocks provide finer control over locking by allowing us to specify the exact object whose monitor is
            * used, unlike synchronized methods which implicitly lock this or ClassName.class.
                   * */
    }
}

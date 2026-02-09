package com.eazybytes.multithreading;

public class BrokenCacheDemo {
    public static void main(String[] args) {
        Cache cache = new Cache();
        // Writer thread
        Thread writer = new Thread(()->{
            for (int i=0; i<1000; i++){
                cache.putData( "key"+i, "value"+i);
                System.out.println("Putting key: "+i);
            }
        });

        // Reader thread
        Thread reader1 = new Thread(()->{
            for (int i=0; i<1000; i++){
                System.out.println("Reading key: "+cache.getData("key"+i));
            }
        });

        Thread reader2 = new Thread(()->{
            for (int i=0; i<1000; i++){
                System.out.println("Reading key: "+cache.getData("key"+i));
            }
        });

        // Reader thread
//        Thread reader1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                String value = cache.getData("key" + i);
//                System.out.println("READER-1 GET key" + i + " = " + value);
//            }
//        });
//
//        Thread reader2 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                String value = cache.getData("key" + i);
//                System.out.println("READER-2 GET key" + i + " = " + value);
//            }
//        });

        writer.start();
        reader1.start();
        reader2.start();
    }
}

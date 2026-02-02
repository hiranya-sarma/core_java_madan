package com.eazybytes.thread;

import java.util.concurrent.Semaphore;

class Resource{
    void use(){
        System.out.println(Thread.currentThread().getName()+" using resource");

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){}
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        Resource resource = new Resource();
        Runnable task = ()->{
            try {
                semaphore.acquire();
                resource.use();
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
        };

        for (int i = 1; i <= 10; i++) {
            new Thread(task, "Thread-"+i).start();
        }
    }
}

package com.globalsoftwaresupport;

class NormalWorker implements Runnable{
    @Override
    public void run() {
       try{
           Thread.sleep(1000);
       }catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
       System.out.println("Executing the normal thread...");
    }
}

class DaemonWorker implements Runnable{
    @Override
    public void run() {
        while(true) {
            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Executing the daemon thread...");
        }
    }
}

public class DaemonDemo {
    public static void main(String[] args) {
        // JVM will terminate if there is only one thread running
        //JVM does not kill the user/worker threads !!!
        // foreground thread with high priority
        Thread t1 = new Thread(new NormalWorker());
        //JVM will kill the daemon threads if no user/worker threads are present
        Thread t2 = new Thread(new DaemonWorker());
        t2.setDaemon(true);
        System.out.println(t1.isDaemon());
        System.out.println(t2.isDaemon());
        t1.start();
        t2.start();
    }
}

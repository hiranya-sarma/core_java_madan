package com.eazybytes.thread;

import java.io.PrintStream;

public class SimpleMetricsExample {
    public static void main(String[] args) {
        Metrics metrics = new Metrics();
//        Worker worker1 = new Worker(metrics);
//        Worker worker2 = new Worker(metrics);
//        worker1.start();
//        worker2.start();
//        new Printer(metrics).start();
        new Worker(metrics).start();
        new Worker(metrics).start();
        new Printer(metrics).start();

    }
    static class Printer extends Thread {
        private Metrics metrics;
        public Printer(Metrics metrics) {
            this.metrics = metrics;
        }
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){}
                System.out.println("Average = "+metrics.getAverage());

            }
        }
    }

    static class Worker extends Thread {
        private Metrics metrics;

        public Worker(Metrics metrics) {
            this.metrics = metrics;
        }

        @Override
        public void run() {
           while (true) {
               metrics.addNumber(10);
               try {
                   Thread.sleep(500);
               }catch (InterruptedException e){

               }
           }
        }
    }

    static class Metrics{
        private long count = 0;
        private volatile double average = 0;

        public synchronized void addNumber(long number){
            average = (average * count + number) / (++count);
        }
        public double getAverage(){
            return average;
        }

    }
}

package com.eazybytes.thread;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceIntermediate {
    public static void main(String[] args) throws InterruptedException {
        AtomicReference<Order> orderRef = new AtomicReference<>(new Order("CREATED", 0));

        Thread paymentThread = new Thread(()->{
            orderRef.set(new Order("PAID", 100));
        });

        Thread shippingThread = new Thread(()->{
            orderRef.set(new Order("SHIPPED", 200));
        });

        paymentThread.start();
        shippingThread.start();

        paymentThread.join();
        shippingThread.join();

        System.out.println(orderRef.get().toString());
    }

    // Immutable object
    static class Order{
        private final String status;
        private final int amount;

        public Order(String status, int amount) {
            this.status = status;
            this.amount = amount;
        }

        @Override
        public String toString(){
            return "Order{status='" + status + "', amount=" + amount + "}";
        }

    }
}

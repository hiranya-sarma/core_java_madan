package com.designpatterns.chadderby.structural.adapter;

import java.math.BigDecimal;

public class MainApp {
    public static void main(String[] args) {

         PaymentService paymentService = new PaymentService();

         PaymentProcessor demo = new DemoPaymentProcessor();

         paymentService.processPayment(demo, new BigDecimal("100.00"));

         // PayPal (BigDecimal+currency)
         PaymentProcessor payPal = new PaypalAdapter(new PayPalSDK());
         paymentService.processPayment(payPal, new BigDecimal("125.00"));

        // Stripe (BigDecimal+currency)
        PaymentProcessor stripe = new StripeAdapter(new StripeSDK());
        paymentService.processPayment(stripe, new BigDecimal("150.00"));


    }
}

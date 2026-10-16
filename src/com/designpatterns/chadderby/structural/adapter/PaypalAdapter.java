package com.designpatterns.chadderby.structural.adapter;

import java.math.BigDecimal;

public class PaypalAdapter implements PaymentProcessor {

    private PayPalSDK payPalSDK;

    public PaypalAdapter(PayPalSDK payPalSDK) {
        this.payPalSDK = payPalSDK;
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("[PaypalAdapter] Forwarding payment for "+amount + " with currency USD");
        payPalSDK.sendPayment(amount, "USD");
    }
}

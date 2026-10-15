package com.chadderby.designpatterns.structural.adapter;

import java.math.BigDecimal;

public class DemoPaymentProcessor implements PaymentProcessor {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Processing demo payment of: "+amount);
    }

}

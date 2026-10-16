package com.designpatterns.chadderby.structural.adapter;

import java.math.BigDecimal;

public class StripeSDK {

    public void makePayment(long cents) {
        System.out.println("Processing stripe payment of "+new BigDecimal(cents).movePointLeft(2).toPlainString());
    }
}

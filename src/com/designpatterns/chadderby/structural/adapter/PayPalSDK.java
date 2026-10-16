package com.designpatterns.chadderby.structural.adapter;

import java.math.BigDecimal;

public class PayPalSDK {

    public void sendPayment(BigDecimal amount, String currencyCode) {
        System.out.println("Processing paypal payment of "+amount+" "+currencyCode);
    }
}

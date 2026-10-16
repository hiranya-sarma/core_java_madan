package com.designpatterns.chadderby.structural.adapter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StripeAdapter implements PaymentProcessor {

    private StripeSDK stripeSDK;

    public StripeAdapter(StripeSDK stripeSDK) {
        this.stripeSDK = stripeSDK;
    }

    @Override
    public void pay(BigDecimal amount) {
       BigDecimal scaled = amount.setScale(2, RoundingMode.HALF_UP);
       long cents = scaled.movePointRight(2).longValueExact();
       System.out.println("[StripeAdapter] converting amount "+scaled+" -> "+ cents+ " cents for stripe");
       stripeSDK.makePayment(cents);
    }
}

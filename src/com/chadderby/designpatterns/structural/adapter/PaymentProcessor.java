package com.chadderby.designpatterns.structural.adapter;

import java.math.BigDecimal;

public interface PaymentProcessor {

    void pay(BigDecimal amount);
}

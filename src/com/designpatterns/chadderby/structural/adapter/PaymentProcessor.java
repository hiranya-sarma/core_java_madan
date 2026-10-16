package com.designpatterns.chadderby.structural.adapter;

import java.math.BigDecimal;

public interface PaymentProcessor {

    void pay(BigDecimal amount);
}

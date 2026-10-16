package com.designpatterns.chadderby.structural.bridge;

import java.math.BigDecimal;

public interface CurrencyProcessor {

    void pay(BigDecimal amount);
}

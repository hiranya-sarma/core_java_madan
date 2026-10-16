package com.designpatterns.chadderby.structural.bridge;

import java.math.BigDecimal;

public abstract class Payment{

    protected CurrencyProcessor currencyProcessor;
    public Payment(CurrencyProcessor currencyProcessor) {
        this.currencyProcessor = currencyProcessor;
    }

    public abstract void pay(BigDecimal amount);

}

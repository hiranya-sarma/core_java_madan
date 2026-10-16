package com.designpatterns.chadderby.structural.bridge;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class EurCurrencyProcessor implements CurrencyProcessor {
    @Override
    public void pay(BigDecimal amount) {

        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        System.out.println("EUR payment of: " + f.format(amount));
    }
}

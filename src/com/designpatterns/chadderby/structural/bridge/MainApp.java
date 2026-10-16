package com.designpatterns.chadderby.structural.bridge;

import java.math.BigDecimal;

public class MainApp {
    public static void main(String[] args) {

        Payment eurPayment = new NetBankingPayment(new EurCurrencyProcessor());
        eurPayment.pay(new BigDecimal("200.00"));

        Payment usdPayment = new CreditCardPayment(new UsdCurrencyProcessor());
        usdPayment.pay(new BigDecimal("300.00"));
    }
}

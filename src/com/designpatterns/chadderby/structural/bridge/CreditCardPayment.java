package com.designpatterns.chadderby.structural.bridge;

import java.math.BigDecimal;

public class CreditCardPayment extends Payment{

    public CreditCardPayment(CurrencyProcessor currencyProcessor) {
        super(currencyProcessor);
    }

    private void authorizeCreditCard(){
        System.out.println("[CreditCardPayment] Contacting payment gateway to authorize charge...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("[CreditCardPayment] card authorized.");
    }

    @Override
    public void pay(BigDecimal amount) {
       System.out.println("----BEGIN: Credit card transaction Transaction---");
       authorizeCreditCard();
       currencyProcessor.pay(amount);
       System.out.println("----END: Credit card transaction Transaction---");
    }

}

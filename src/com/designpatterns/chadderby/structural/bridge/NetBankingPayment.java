package com.designpatterns.chadderby.structural.bridge;

import java.math.BigDecimal;

public class NetBankingPayment extends Payment{

    public NetBankingPayment(CurrencyProcessor currencyProcessor) {
        super(currencyProcessor);
    }

    private void connectToBankApi(){
        System.out.println("[NetBankingPayment] Establishing secure connection to bank api...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("[NetBankingPayment] connection successful.");
    }

    @Override
    public void pay(BigDecimal amount) {
       System.out.println("----BEGIN: Net Banking Transaction---");
       connectToBankApi();
       currencyProcessor.pay(amount);
       System.out.println("----END: Net Banking Transaction---");
    }

}

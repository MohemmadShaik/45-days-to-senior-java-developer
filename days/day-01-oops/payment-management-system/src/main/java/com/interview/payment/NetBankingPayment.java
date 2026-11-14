package com.interview.payment;
import java.math.BigDecimal;

public class NetBankingPayment implements Payment {

    @Override
    public void processPayment(BigDecimal amount) {

        System.out.println("Processing NetBanking payment: ₹"+amount);
    }
    
}

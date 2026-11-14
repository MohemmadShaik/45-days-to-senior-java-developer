package com.interview.payment;

import java.math.BigDecimal;

public class WalletPayment implements Payment {
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Processing the Wallet Payment: ₹" +amount);
    }
    
}

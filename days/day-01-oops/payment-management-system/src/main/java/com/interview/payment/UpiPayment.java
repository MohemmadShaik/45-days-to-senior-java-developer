package com.interview.payment;

import java.math.BigDecimal;

public class UpiPayment implements Payment {
    @Override
    public void processPayment(BigDecimal amount) {
        System.out.println("Processing UPI payment: ₹" + amount);
    }

}

/*
 * @Override : It tells the compiler we intend to override or implement a method
 * inherited from a supertype. It also helps catch accidental signature
 * mismatches.
 */
package com.interview.payment;

import java.math.BigDecimal;

public class CardPayment implements Payment {
    @Override
    public void processPayment(BigDecimal amount) {

        System.out.println("Processing the Card Payment: ₹" + amount);
    }

}

package com.interview.payment;

import java.math.BigDecimal;

public class PaymentService {

    public static void main(String[] args) {

        Payment payment = new UpiPayment();

        payment.processPayment(new BigDecimal("100.00"));

        payment = new CardPayment();
        payment.processPayment(new BigDecimal("3300.00"));

        payment = new NetBankingPayment();
        payment.processPayment(new BigDecimal("40000.00"));

        payment = new WalletPayment();
        payment.processPayment(new BigDecimal("1200.00"));

    }
}

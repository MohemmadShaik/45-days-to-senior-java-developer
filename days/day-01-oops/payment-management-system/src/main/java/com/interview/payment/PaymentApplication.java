
package com.interview.payment;

import java.math.BigDecimal;

public class PaymentApplication {

    public static void main(String[] args) {

        Payment payment = new UpiPayment();

        PaymentService paymentService = new PaymentService(payment);

        paymentService.processPayment(
                new BigDecimal("1000.00"));
    }
}

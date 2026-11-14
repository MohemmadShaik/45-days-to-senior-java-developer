
package com.interview.payment;

import java.math.BigDecimal;
import java.util.Objects;

public class PaymentService {

    private final Payment payment;

    public PaymentService(Payment payment) {
        this.payment = Objects.requireNonNull(payment);
    }

    public void processPayment(BigDecimal amount) {
        payment.processPayment(amount);
    }
}

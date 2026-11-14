package com.interview.payment;

import java.math.BigDecimal;

/**
 * Defines the contract for all supported payment methods.
 */
public interface Payment {

    void processPayment(BigDecimal amount);

}

package com.interview.payment;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {

    @Test
    void shouldInitializePaymentServiceWithValidDependency() {

        Payment payment = amount -> {};

        PaymentService paymentService =
                new PaymentService(payment);

        assertNotNull(paymentService);
    }

    @Test
    void shouldThrowExceptionWhenPaymentDependencyIsNull() {

        assertThrows(
                NullPointerException.class,
                () -> new PaymentService(null)
        );
    }

    @Test
    void shouldDelegatePaymentProcessingToInjectedPayment() {

        AtomicReference<BigDecimal> capturedAmount =
                new AtomicReference<>();

        Payment payment = capturedAmount::set;

        PaymentService paymentService =
                new PaymentService(payment);

        BigDecimal expectedAmount =
                new BigDecimal("1500.00");

        paymentService.processPayment(expectedAmount);

        assertEquals(expectedAmount, capturedAmount.get());
    }

    @Test
    void shouldSupportDifferentPaymentImplementations() {

        AtomicReference<String> paymentType =
                new AtomicReference<>();

        Payment upiPayment =
                amount -> paymentType.set("UPI");

        Payment cardPayment =
                amount -> paymentType.set("CARD");

        PaymentService upiService =
                new PaymentService(upiPayment);

        PaymentService cardService =
                new PaymentService(cardPayment);

        upiService.processPayment(new BigDecimal("100.00"));
        assertEquals("UPI", paymentType.get());

        cardService.processPayment(new BigDecimal("200.00"));
        assertEquals("CARD", paymentType.get());
    }
}

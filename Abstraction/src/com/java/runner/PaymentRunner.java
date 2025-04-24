package com.java.runner;

import com.java.external.UpiPayment;
import com.java.internal.CreditCardPayment;
import com.java.internal.Payment;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        UpiPayment upiPayment = new UpiPayment(payment);
        upiPayment.upiId();
    }
}

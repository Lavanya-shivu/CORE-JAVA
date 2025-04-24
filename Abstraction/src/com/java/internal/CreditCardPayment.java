package com.java.internal;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(){
        System.out.println("Paid amount using creditcard");
    }

}

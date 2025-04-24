package com.java.external;

import com.java.internal.Payment;

public class UpiPayment {
    private Payment payment;
    public UpiPayment(Payment payment){
        this.payment = payment;
    }

    public void upiId(){

        if(payment!= null){
            System.out.println("Paying through UPI");
            this.payment.pay();
        }
        else {
            System.out.println("Not UPI");
        }
    }
}

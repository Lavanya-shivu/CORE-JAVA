package com.java.internal.card;

public class ATM {
    public void cardATM(){
        Card card=new Card();
        card.swipe();
        card.debit();
        System.out.println("ATM card");

    }
}

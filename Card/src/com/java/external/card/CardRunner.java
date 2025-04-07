package com.java.external.card;

import com.java.internal.card.ATM;

public class CardRunner {
    public static void main(String[] args){
        ATM atm=new ATM();
        atm.cardATM();
        System.out.println("card of the ATM");

        PIN pin=new PIN();
        pin.cardPIN();
        System.out.println("pin of the card");
    }
}

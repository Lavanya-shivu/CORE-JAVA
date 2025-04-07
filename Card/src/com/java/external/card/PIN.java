package com.java.external.card;

import com.java.internal.card.Card;

public class PIN {
    public void cardPIN(){
        Card card=new Card();
        card.swipe();
        System.out.println("ATM card PIN");
    }
}

package com.java.external.Airconditioner;

import com.java.internal.Wallet;

public class LeatherWallet {
    public void leatherWallet(Wallet wallet) {
        if (wallet != null) {
            if (wallet instanceof DigitalWallet) {
                DigitalWallet digitalWallet = (DigitalWallet) wallet;
                digitalWallet.addMoney();
                digitalWallet.close();
            } else {
                wallet.open();
                System.out.println("Wallet is LeatherWallet");
            }
        } else {
            System.out.println("Wallet is null");
        }
    }
}

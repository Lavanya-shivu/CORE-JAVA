package com.java.external.Airconditioner;

import com.java.internal.Wallet;

public class DigitalWallet extends Wallet {
    public DigitalWallet() {
        System.out.println("No-argument constructor in DigitalWallet");
    }

    public void addMoney() {
        System.out.println("Adding money to the digital wallet.");
    }

    public void close() {
        System.out.println("Closing the wallet.");
    }

    public void close(Wallet wallet) {
        if (wallet != null) {
            System.out.println("Wallet is securely closed.");
        } else {
            System.out.println("No wallet found to close.");
        }
    }
}

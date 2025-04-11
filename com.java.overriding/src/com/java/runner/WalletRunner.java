package com.java.runner;

import com.java.external.Airconditioner.DigitalWallet;

public class WalletRunner {
    public static void main(String[] args) {
        DigitalWallet wallet = new DigitalWallet();
        wallet.open();                // Base class method
        System.out.println("--------------------------");

        wallet.addMoney();            // Subclass method
        wallet.close();               // Subclass method
        wallet.close(wallet);         // With object
        wallet.close(null);           // With null
        System.out.println("==========================");
    }
}

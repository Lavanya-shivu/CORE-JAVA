package com.java.internal;

public class Wallet {
    private String owner;
    private double balance;

    public Wallet(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void open() {
        System.out.println("Opening the wallet.");
    }

    @Override
    public String toString() {
        return "Wallet [Owner: " + owner + ", Balance: $" + balance + "]";
    }
}

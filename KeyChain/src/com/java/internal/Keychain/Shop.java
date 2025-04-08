package com.java.internal.Keychain;

public class Shop {
    public void keychainShop() {
        KeyChain keychain = new KeyChain();

        // Print initial default values
        System.out.println("Key chain type:");
        System.out.println("Color: " + keychain.getColor());
        System.out.println("Brand: " + keychain.getBrand());
        System.out.println("Material: " + keychain.getMaterial());
        System.out.println("length: " + keychain.getlength());
        System.out.println("Prize: " + keychain.getPrize());

        // Using package-access setters to update values
        keychain.setColor("Yellow");
        keychain.setBrand("Zudio");
        keychain.setMaterial("Woolen");
        keychain.setlength(3);
        keychain.setPrice(80);

        // Print updated values
        System.out.println("\nUpdated KeyChain Values:");
        System.out.println("Color: " + keychain.getColor());
        System.out.println("Brand: " + keychain.getBrand());
        System.out.println("Material: " + keychain.getMaterial());
        System.out.println("length: " + keychain.getlength());
        System.out.println("Prize: " + keychain.getPrize());
    }
}

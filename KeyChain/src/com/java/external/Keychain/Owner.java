package com.java.external.Keychain;

import com.java.internal.Keychain.KeyChain;

public class Owner {
    public void keychainOWner() {
        KeyChain keychain = new KeyChain();

        // Can only use public getters from different package
        System.out.println("Color: " + keychain.getColor());
        System.out.println("Brand: " + keychain.getBrand());
        System.out.println("Material: " + keychain.getMaterial());
        System.out.println("length: " + keychain.getlength());
        System.out.println("Prize: " + keychain.getPrize());

    }
}

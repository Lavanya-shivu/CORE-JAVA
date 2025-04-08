package com.java.external.Keychain;

import com.java.internal.Keychain.Shop;

public class KeyChainRunner {
    public static void main(String[] args) {
        Shop shop= new Shop();
        shop.keychainShop();

        Owner owner = new Owner();
        owner.keychainOWner();
    }
}

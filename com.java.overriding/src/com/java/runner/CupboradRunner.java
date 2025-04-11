package com.java.runner;

import com.java.external.Airconditioner.Storage;

import com.java.internal.Cupborad;
import com.java.external.Airconditioner.Storage;

public class CupboradRunner {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.open();
        System.out.println("--------------------------");

        storage.material();
        storage.close();
        storage.close(storage);  // with object
        storage.close(null);            // with null
        System.out.println("==========================");
    }
}

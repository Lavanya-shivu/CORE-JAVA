package com.java.external.Airconditioner;

import com.java.internal.Zip;

public class JacketZip extends Zip {
    public JacketZip() {
        System.out.println("No-argument constructor in JacketZip");
    }

    public void unzip() {
        System.out.println("Unzipping the jacket.");
    }

    public void lock() {
        System.out.println("Locking the zip in place.");
    }

    public void lock(Zip zip) {
        if (zip != null) {
            System.out.println("Zip is locked securely.");
        } else {
            System.out.println("No zip to lock.");
        }
    }
}

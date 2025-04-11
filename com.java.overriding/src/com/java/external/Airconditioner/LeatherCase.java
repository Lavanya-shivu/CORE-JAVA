package com.java.external.Airconditioner;

import com.java.internal.PhoneCase;

public class LeatherCase extends PhoneCase {
    public LeatherCase() {
        System.out.println("No-argument constructor in LeatherCase");
    }

    public void flipCover() {
        System.out.println("Flipping the leather cover.");
    }

    public void close() {
        System.out.println("Closing the leather phone case.");
    }

    public void close(PhoneCase phoneCase) {
        if (phoneCase != null) {
            System.out.println("Leather phone case closed securely.");
        } else {
            System.out.println("No phone case to close.");
        }
    }
}

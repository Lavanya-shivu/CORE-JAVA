package com.java.external.Airconditioner;

import com.java.internal.Sweater;

public class WoolSweater extends Sweater {
    public WoolSweater() {
        System.out.println("No-argument constructor in WoolSweater");
    }

    public void fabric() {
        System.out.println("This sweater is made of wool.");
    }

    public void fold() {
        System.out.println("Folding the wool sweater.");
    }

    public void fold(Sweater sweater) {
        if (sweater != null) {
            System.out.println("Sweater folded and placed neatly.");
        } else {
            System.out.println("No sweater to fold.");
        }
    }
}

package com.java.external.Airconditioner;

import com.java.internal.Curtain;

public class AutoCurtain extends Curtain {
    public AutoCurtain() {
        System.out.println("No-argument constructor in AutoCurtain");
    }

    public void adjustLight() {
        System.out.println("Adjusting light using automatic curtain.");
    }

    public void close() {
        System.out.println("Closing the curtain.");
    }

    public void close(Curtain curtain) {
        if (curtain != null) {
            System.out.println("Curtain is closed properly.");
        } else {
            System.out.println("No curtain found to close.");
        }
    }
}

package com.java.external.Airconditioner;

import com.java.internal.Lantern;

public class SkyLantern extends Lantern {
    public SkyLantern() {
        System.out.println("No-argument constructor in SkyLantern");
    }

    public void floatUp() {
        System.out.println("Sky lantern is floating up in the sky.");
    }

    public void celebrate() {
        System.out.println("Lanterns are released during the festival.");
    }

    public void celebrate(Lantern lantern) {
        if (lantern != null) {
            System.out.println("Celebration with glowing lanterns.");
        } else {
            System.out.println("No lantern found to celebrate with.");
        }
    }
}

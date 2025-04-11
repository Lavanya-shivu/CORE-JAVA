package com.java.external.Airconditioner;

import com.java.internal.Broom;

public class ElectricBroom extends Broom {
    public ElectricBroom() {
        System.out.println("No-argument constructor in ElectricBroom");
    }

    public void vacuumMode() {
        System.out.println("Switching to vacuum mode.");
    }

    public void cleanDust() {
        System.out.println("Cleaning dust automatically.");
    }

    public void cleanDust(Broom broom) {
        if (broom != null) {
            System.out.println("Dust collected using smart sensor.");
        } else {
            System.out.println("No broom detected for cleaning.");
        }
    }
}

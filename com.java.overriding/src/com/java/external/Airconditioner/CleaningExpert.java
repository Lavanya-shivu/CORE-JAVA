package com.java.external.Airconditioner;

import com.java.internal.Broom;

public class CleaningExpert {
    public void clean(Broom broom) {
        if (broom != null) {
            System.out.println("Starting cleaning process...");

            if (broom instanceof ElectricBroom) {
                ElectricBroom electricBroom = (ElectricBroom) broom;
                electricBroom.vacuumMode();
                electricBroom.cleanDust();
            } else {
                broom.sweep();
                System.out.println("Sweeping the floor using a regular broom.");
            }
        } else {
            System.err.println("No broom available for cleaning.");
        }
    }
}

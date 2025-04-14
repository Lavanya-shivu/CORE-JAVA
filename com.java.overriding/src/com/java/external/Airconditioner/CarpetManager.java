package com.java.external.Airconditioner;

import com.java.internal.Carpet;

public class CarpetManager {
    public void manage(Carpet carpet) {
        if (carpet != null) {
            System.out.println("Managing the carpet...");

            if (carpet instanceof Dinning) {
                Dinning dinningCarpet = (Dinning) carpet;
                dinningCarpet.material();
                dinningCarpet.clean();
            } else {
                carpet.layDown();
                System.out.println("Laying down the regular carpet.");
            }
        } else {
            System.err.println("No carpet to manage.");
        }
    }
}

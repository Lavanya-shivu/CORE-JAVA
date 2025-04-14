package com.java.external.Airconditioner;

import com.java.internal.Compass;

public class NavigationManager {
    public void manage(Compass compass) {
        if (compass != null) {
            System.out.println("Managing the compass...");

            if (compass instanceof DigitalCompass) {
                DigitalCompass digitalCompass = (DigitalCompass) compass;
                digitalCompass.calibrate();
                digitalCompass.locate();
            } else {
                compass.showDirection();
                System.out.println("Standard compass showing direction.");
            }
        } else {
            System.err.println("No compass to manage.");
        }
    }
}

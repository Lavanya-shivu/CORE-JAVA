package com.java.external.Airconditioner;

import com.java.internal.Lantern;
import com.java.internal.Sky;

public class FloatingLantern {
    public void floatingLantern(Lantern lantern) {
        if (lantern != null) {
            System.out.println("Lantern is ready to light");

            if (lantern instanceof SkyLantern) {
                SkyLantern skyLantern = (SkyLantern) lantern;
                skyLantern.floatUp();
                skyLantern.celebrate();
            } else {
                lantern.glow();
                System.err.println("This is a floating lantern");
            }
        } else {
            System.err.println("LAntern is null.");
        }
    }
}

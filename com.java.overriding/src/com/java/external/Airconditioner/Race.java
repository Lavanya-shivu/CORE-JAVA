package com.java.external.Airconditioner;

import com.java.internal.Helmet;
import com.java.internal.Ride;

public class Race {
    public void race(Helmet helmet) {
        if (helmet != null) {
            System.out.println("Helmet is ready to wear!");

            if (helmet instanceof Ride) {
                Ride ride = (Ride) helmet;
                ride.features();
                ride.secure();
            } else {
                helmet.protect();
                System.err.println("This is a ride Helmet.");
            }
        } else {
            System.err.println("Hemet is null.");
        }
    }
}

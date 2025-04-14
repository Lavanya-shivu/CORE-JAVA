package com.java.external.Airconditioner;

import com.java.internal.Charger;

public class ChargerManager {
    public void manage(Charger charger) {
        if (charger != null) {
            System.out.println("Managing the charger...");

            if (charger instanceof PhoneCharger) {
                PhoneCharger phoneCharger = (PhoneCharger) charger;
                phoneCharger.specs();
                phoneCharger.connect();
            } else {
                charger.supplyPower();
                System.out.println("Supplying power through a regular charger.");
            }
        } else {
            System.err.println("No charger to manage.");
        }
    }
}

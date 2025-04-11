package com.java.external.Airconditioner;

import com.java.internal.Charger;

public class PhoneCharger extends Charger {
    public PhoneCharger() {
        System.out.println("No-argument constructor in ObjectCharger");
    }

    public void specs() {
        System.out.println("Charger supports fast charging and USB-C port");
    }

    public void connect() {
        System.out.println("Charger connected to the device");
    }

    public void connect(Charger charger) {
        if (charger != null) {
            System.out.println("Device is charging");
        } else {
            System.out.println("No charger connected");
        }
    }
}

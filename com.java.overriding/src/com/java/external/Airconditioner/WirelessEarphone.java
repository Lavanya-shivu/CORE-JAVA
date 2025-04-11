package com.java.external.Airconditioner;

import com.java.internal.Earphone;

public class WirelessEarphone extends Earphone {
    public WirelessEarphone() {
        System.out.println("No-argument constructor in WirelessEarphone");
    }

    public void connectBluetooth() {
        System.out.println("Earphone connected via Bluetooth.");
    }

    public void disconnect() {
        System.out.println("Earphone disconnected.");
    }

    public void disconnect(Earphone earphone) {
        if (earphone != null) {
            System.out.println("Earphone is safely disconnected.");
        } else {
            System.out.println("No earphone found to disconnect.");
        }
    }
}

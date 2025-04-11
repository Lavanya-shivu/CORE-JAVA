package com.java.external.Airconditioner;

import com.java.internal.Remote;

public class TvRemote extends Remote {
    public TvRemote() {
        System.out.println("No-argument constructor in SmartRemote");
    }

    public void connectBluetooth() {
        System.out.println("Remote connected via Bluetooth.");
    }

    public void turnOff() {
        System.out.println("SmartRemote is turning off the device.");
    }

    public void turnOff(Remote remote) {
        if (remote != null) {
            System.out.println("Turning off using the remote.");
        } else {
            System.out.println("No remote detected to turn off.");
        }
    }
}

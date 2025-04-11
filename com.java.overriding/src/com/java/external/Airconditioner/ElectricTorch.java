package com.java.external.Airconditioner;

import com.java.internal.Torch;

public class ElectricTorch extends Torch {
    public ElectricTorch() {
        System.out.println("No-argument constructor in ElectricTorch");
    }

    public void batteryStatus() {
        System.out.println("Battery is full.");
    }

    public void beamMode() {
        System.out.println("Beam is set to high mode.");
    }

    public void beamMode(Torch torch) {
        if (torch != null) {
            System.out.println("Torch beam is strong.");
        } else {
            System.out.println("No torch to set beam mode.");
        }
    }
}

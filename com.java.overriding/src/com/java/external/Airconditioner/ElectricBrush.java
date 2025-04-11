package com.java.external.Airconditioner;

import com.java.internal.ToothBrush;

public class ElectricBrush extends ToothBrush {
    public ElectricBrush() {
        System.out.println("No-argument constructor in ElectricBrush");
    }

    public void vibrate() {
        System.out.println("Electric brush is vibrating for deeper cleaning.");
    }

    public void turnOff() {
        System.out.println("Turning off the electric toothbrush.");
    }

    public void turnOff(ToothBrush brush) {
        if (brush != null) {
            System.out.println("Electric toothbrush turned off safely.");
        } else {
            System.out.println("No toothbrush to turn off.");
        }
    }
}

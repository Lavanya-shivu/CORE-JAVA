package com.java.external.Airconditioner;

import com.java.internal.Wheel;

public class AlloyWheel extends Wheel {
    public AlloyWheel() {
        System.out.println("No-argument constructor in AlloyWheel");
    }

    public void grip() {
        System.out.println("Alloy wheel has excellent road grip.");
    }

    public void stop() {
        System.out.println("Alloy wheel is stopping.");
    }

    public void stop(Wheel wheel) {
        if (wheel != null) {
            System.out.println("Wheel stopped successfully.");
        } else {
            System.out.println("No wheel to stop.");
        }
    }
}

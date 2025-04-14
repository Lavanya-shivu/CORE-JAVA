package com.java.external.Airconditioner;

import com.java.internal.Fireworks;

public class RobotFireworks {
    public void ignite(Fireworks fireworks) {
        if (fireworks != null) {
            fireworks.explode();
            if (fireworks instanceof ColorfulFireworks) {
                ColorfulFireworks colorfulFireworks = (ColorfulFireworks) fireworks;//casting
                colorfulFireworks.colors();
            } else {
                System.err.println("fireworks not robot");
            }
        } else {
            System.err.println("fireworks is null..");
        }
    }
}

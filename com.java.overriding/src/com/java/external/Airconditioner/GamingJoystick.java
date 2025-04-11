package com.java.external.Airconditioner;

import com.java.internal.Joystick;

public class GamingJoystick extends Joystick {
    public GamingJoystick() {
        System.out.println("No-argument constructor in GamingJoystick");
    }

    public void pressTrigger() {
        System.out.println("Trigger button pressed on joystick.");
    }

    public void calibrate() {
        System.out.println("Calibrating the joystick for smooth control.");
    }

    public void calibrate(Joystick joystick) {
        if (joystick != null) {
            System.out.println("Joystick calibrated successfully using provided object.");
        } else {
            System.out.println("No joystick available to calibrate.");
        }
    }
}

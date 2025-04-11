package com.java.external.Airconditioner;

import com.java.internal.Gamepad;

public class WirelessGamepad extends Gamepad {
    public WirelessGamepad() {
        System.out.println("No-argument constructor in WirelessGamepad");
    }

    public void pressButton() {
        System.out.println("Button pressed on wireless gamepad.");
    }

    public void vibrate() {
        System.out.println("Gamepad is vibrating for feedback.");
    }

    public void vibrate(Gamepad gamepad) {
        if (gamepad != null) {
            System.out.println("Gamepad is vibrating through provided gamepad object.");
        } else {
            System.out.println("No gamepad connected to vibrate.");
        }
    }
}

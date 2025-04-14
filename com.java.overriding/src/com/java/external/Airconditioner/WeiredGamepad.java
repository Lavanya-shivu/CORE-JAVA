package com.java.external.Airconditioner;

import com.java.internal.Gamepad;

public class WeiredGamepad {
    public void weiredGamepad(Gamepad gamepad) {
        if (gamepad != null) {
            if (gamepad instanceof WirelessGamepad) {
                WirelessGamepad wirelessGamepad = (WirelessGamepad) gamepad;
                wirelessGamepad.pressButton();
                wirelessGamepad.vibrate();
            } else {
                gamepad.connect();
                System.err.println("Gamepad is wireless.");
            }
        } else {
            System.err.println("Gamepad is null");
        }
    }
}

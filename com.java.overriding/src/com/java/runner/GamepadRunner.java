package com.java.runner;

import com.java.external.Airconditioner.WirelessGamepad;

public class GamepadRunner {
    public static void main(String[] args) {
        WirelessGamepad gamepad = new WirelessGamepad();
        gamepad.connect();
        System.out.println("--------------------------");

        gamepad.pressButton();
        gamepad.vibrate();
        gamepad.vibrate(gamepad);
        gamepad.vibrate(null);
        System.out.println("==========================");
    }
}

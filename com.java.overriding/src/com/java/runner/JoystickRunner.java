package com.java.runner;

import com.java.external.Airconditioner.GamingJoystick;

public class JoystickRunner {
    public static void main(String[] args) {
        GamingJoystick joystick = new GamingJoystick();
        joystick.move();
        System.out.println("--------------------------");

        joystick.pressTrigger();
        joystick.calibrate();
        joystick.calibrate(joystick);
        joystick.calibrate(null);
        System.out.println("==========================");
    }
}

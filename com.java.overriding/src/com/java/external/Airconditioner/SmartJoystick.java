package com.java.external.Airconditioner;

import com.java.internal.Gamepad;
import com.java.internal.Joystick;

public class SmartJoystick {
    public void smartJoystick(Joystick joystick) {
        if (joystick != null) {
            System.out.println("Joystic is helpfull");

            if (joystick instanceof GamingJoystick) {
                GamingJoystick gamingJoystick = (GamingJoystick) joystick;
                gamingJoystick.pressTrigger();
                gamingJoystick.calibrate();

            } else {
                joystick.move();
                System.err.println("This is a Gaming joyStick.");
            }
        } else {
            System.err.println("Joystick is null.");
        }
    }
}

package com.java.external.Airconditioner;

import com.java.internal.Hoverboard;

public class RacingHoverboard {
    public void racingHoverborad(Hoverboard hoverboard) {
        if (hoverboard != null) {
            System.out.println("Hoverborad is fast!");

            if (hoverboard instanceof SmartHoverboard) {
                SmartHoverboard smartHoverboard = (SmartHoverboard) hoverboard;
                smartHoverboard.charge();
                smartHoverboard.balance();
            } else {
                hoverboard.ride();
                System.err.println("Hoverborad is ride.");
            }
        } else {
            System.err.println("Hoverborad is null.");
        }
    }
}

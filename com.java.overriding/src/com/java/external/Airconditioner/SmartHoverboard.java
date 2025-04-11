package com.java.external.Airconditioner;

import com.java.internal.Hoverboard;

public class SmartHoverboard extends Hoverboard {
    public SmartHoverboard() {
        System.out.println("No-argument constructor in SmartHoverboard");
    }

    public void charge() {
        System.out.println("Charging the hoverboard.");
    }

    public void balance() {
        System.out.println("Maintaining balance while riding.");
    }

    public void balance(Hoverboard hoverboard) {
        if (hoverboard != null) {
            System.out.println("Balanced ride with hoverboard.");
        } else {
            System.out.println("No hoverboard to balance.");
        }
    }
}

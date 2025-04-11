package com.java.external.Airconditioner;

import com.java.internal.Whiteboard;

public class SmartWhiteboard extends Whiteboard {
    public SmartWhiteboard() {
        System.out.println("No-argument constructor in SmartWhiteboard");
    }

    public void connectToWiFi() {
        System.out.println("SmartWhiteboard connected to Wi-Fi.");
    }

    public void erase() {
        System.out.println("Erasing the smart whiteboard screen.");
    }

    public void erase(Whiteboard whiteboard) {
        if (whiteboard != null) {
            System.out.println("Erasing the given whiteboard.");
        } else {
            System.out.println("No whiteboard to erase.");
        }
    }
}

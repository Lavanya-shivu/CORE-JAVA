package com.java.external.Airconditioner;

import com.java.internal.Button;

public class ShirtButton extends Button {
    public ShirtButton() {
        System.out.println("No-argument constructor in ShirtButton");
    }

    public void press() {
        System.out.println("Pressing the shirt button.");
    }

    public void detach() {
        System.out.println("Button is detached.");
    }

    public void detach(Button button) {
        if (button != null) {
            System.out.println("Detaching the provided button.");
        } else {
            System.out.println("No button to detach.");
        }
    }
}

package com.java.external.Airconditioner;

import com.java.internal.Button;

public class DressDesigner {
    public void design(Button button) {
        if (button != null) {
            System.out.println("Working on the button...");

            if (button instanceof ShirtButton) {
                ShirtButton shirtButton = (ShirtButton) button;
                shirtButton.press();
                shirtButton.detach();
            } else {
                button.attach();
                System.out.println("Attaching a basic button.");
            }
        } else {
            System.err.println("No button to work on.");
        }
    }
}

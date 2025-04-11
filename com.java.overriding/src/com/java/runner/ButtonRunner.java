package com.java.runner;

import com.java.external.Airconditioner.ShirtButton;

public class ButtonRunner {
    public static void main(String[] args) {
        ShirtButton shirtButton = new ShirtButton();
        shirtButton.attach();              // From base class
        System.out.println("--------------------------");

        shirtButton.press();              // Subclass method
        shirtButton.detach();             // Subclass method
        shirtButton.detach(shirtButton);  // With object
        shirtButton.detach(null);         // With null
        System.out.println("==========================");
    }
}

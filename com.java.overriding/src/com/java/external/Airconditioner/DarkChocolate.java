package com.java.external.Airconditioner;

import com.java.internal.Chocolate;

public class DarkChocolate extends Chocolate {
    public DarkChocolate() {
        System.out.println("No-argument constructor in DarkChocolate");
    }

    public void melt() {
        System.out.println("Dark chocolate melts in your mouth!");
    }

    public void bitterNote() {
        System.out.println("Dark chocolate has a slightly bitter taste.");
    }

    public void bitterNote(Chocolate chocolate) {
        if (chocolate != null) {
            System.out.println("This chocolate has a rich and bold flavor.");
        } else {
            System.out.println("No chocolate to describe.");
        }
    }
}

package com.java.external.Airconditioner;

import com.java.internal.Emoji;

public class SmileEmoji extends Emoji {
    public SmileEmoji() {
        System.out.println("No-argument constructor in SmileEmoji");
    }

    public void react() {
        System.out.println("Smiling emoji reacts with joy.");
    }

    public void animate() {
        System.out.println("Animating the smiling emoji.");
    }

    public void animate(Emoji emoji) {
        if (emoji != null) {
            System.out.println("Animating emoji with special effects.");
        } else {
            System.out.println("No emoji to animate.");
        }
    }
}

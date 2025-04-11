package com.java.external.Airconditioner;

import com.java.internal.Gif;

public class FunnyGif extends Gif {
    public FunnyGif() {
        System.out.println("No-argument constructor in FunnyGif");
    }

    public void loop() {
        System.out.println("Funny GIF is looping endlessly.");
    }

    public void animate() {
        System.out.println("Funny GIF is animated.");
    }

    public void animate(Gif gif) {
        if (gif != null) {
            System.out.println("Animating GIF with custom effects.");
        } else {
            System.out.println("No GIF to animate.");
        }
    }
}

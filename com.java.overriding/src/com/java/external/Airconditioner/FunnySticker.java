package com.java.external.Airconditioner;

import com.java.internal.Sticker;

public class FunnySticker extends Sticker {
    public FunnySticker() {
        System.out.println("No-argument constructor in FunnySticker");
    }

    public void laugh() {
        System.out.println("Funny sticker makes you laugh.");
    }

    public void bounce() {
        System.out.println("Funny sticker bounces on screen.");
    }

    public void bounce(Sticker sticker) {
        if (sticker != null) {
            System.out.println("Bouncing sticker with animation.");
        } else {
            System.out.println("No sticker to bounce.");
        }
    }
}

package com.java.runner;

import com.java.external.Airconditioner.FunnySticker;

public class StickerRunner {
    public static void main(String[] args) {
        FunnySticker sticker = new FunnySticker();
        sticker.send();
        System.out.println("--------------------------");

        sticker.laugh();
        sticker.bounce();
        sticker.bounce(sticker);
        sticker.bounce(null);
        System.out.println("==========================");
    }
}

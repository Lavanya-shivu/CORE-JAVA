package com.java.external.Airconditioner;

import com.java.internal.Sticker;

public class SadSticker {
    public void sadSticker(Sticker sticker){
        if(sticker!= null){
            if(sticker instanceof FunnySticker){
                FunnySticker funnySticker = (FunnySticker) sticker;
                funnySticker.bounce();
                funnySticker.laugh();
            }
            else {
                sticker.send();
                System.err.println("Sticker is sadSticker");
            }
        }
        else {
            System.err.println("Sticker is null");
        }

    }

}

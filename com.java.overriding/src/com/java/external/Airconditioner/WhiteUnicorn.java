package com.java.external.Airconditioner;

import com.java.internal.Unicorn;

public class WhiteUnicorn {
    public void whiteUnicorn(Unicorn unicorn){
        if(unicorn!= null){
            if(unicorn instanceof RainbowUnicorn){
                RainbowUnicorn rainbowUnicorn = (RainbowUnicorn) unicorn;
                rainbowUnicorn.fly();
                rainbowUnicorn.vanish();
            }
            else {
                unicorn.sparkle();
                System.out.println("Unicorn is White");
            }
        }
        else {
            System.out.println("Unicorn is null");

        }
    }
}

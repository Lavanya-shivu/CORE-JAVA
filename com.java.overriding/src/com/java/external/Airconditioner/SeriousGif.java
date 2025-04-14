package com.java.external.Airconditioner;

import com.java.internal.Gif;

public class SeriousGif {
    public void seriousGif(Gif gif) {
        if (gif != null) {
            System.out.println("Gif is animated!");

            if (gif instanceof FunnyGif) {
                FunnyGif funnyGif = (FunnyGif) gif;
                funnyGif.loop();
                funnyGif.animate();
            } else {
                gif.load();
                System.err.println("This is a funny gif.");
            }
        } else {
            System.err.println("Gif is null.");
        }
    }
}

package com.java.external.Airconditioner;

import com.java.internal.Anime;

public class Otaku {
    public void enjoy(Anime anime) {
        if (anime != null) {
            System.out.println("Anime detected.");

            if (anime instanceof Naruto) {
                Naruto naruto = (Naruto) anime;
                naruto.jutsu();
                naruto.believeIt();
            } else {
                anime.watch();
                System.out.println("This is a regular anime.");
            }
        } else {
            System.err.println("Anime is null");
        }
    }
}

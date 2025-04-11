package com.java.external.Airconditioner;

import com.java.internal.Anime;

public class Naruto extends Anime {
    public Naruto() {
        System.out.println("No-argument constructor in Naruto");
    }

    public void jutsu() {
        System.out.println("Naruto uses Shadow Clone Jutsu!");
    }

    public void believeIt() {
        System.out.println("Naruto says: Believe it!");
    }

    public void believeIt(Anime anime) {
        if (anime != null) {
            System.out.println("Anime character believes in their dreams.");
        } else {
            System.out.println("No anime to believe in.");
        }
    }
}

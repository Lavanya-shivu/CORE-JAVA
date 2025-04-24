package com.java.runner;

import com.java.external.Airconditioner.Naruto;
import com.java.internal.Anime;

public class AnimeRunner {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", 1100);
        Anime anime1 =  new Anime();
        Naruto naruto = new Naruto();
        naruto.watch();                  // From Anime
        System.out.println("--------------------------");

        naruto.jutsu();                  // Subclass method
        naruto.believeIt();              // Subclass method
        naruto.believeIt(naruto);        // With object
        naruto.believeIt(null);          // With null
        System.out.println("==========================");
    }
}

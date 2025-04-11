package com.java.runner;

import com.java.external.Airconditioner.Naruto;

public class AnimeRunner {
    public static void main(String[] args) {
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

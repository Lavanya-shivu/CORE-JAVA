package com.java.external.Airconditioner;

import com.java.internal.Candy;

public class CandyMaker {
    public void create(Candy candy) {
        if (candy != null) {
            System.out.println("Creating candy...");

            if (candy instanceof CandyFactory) {
                CandyFactory candyFactory = (CandyFactory) candy;
                candyFactory.wrap();
                candyFactory.flavor();
            } else {
                candy.make();
                System.out.println("Making a basic candy.");
            }
        } else {
            System.err.println("No candy to create.");
        }
    }
}

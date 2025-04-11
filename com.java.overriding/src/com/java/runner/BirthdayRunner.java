package com.java.runner;

import com.java.external.Airconditioner.SurpriseBirthday;

public class BirthdayRunner {
    public static void main(String[] args) {
        SurpriseBirthday surprise = new SurpriseBirthday();
        surprise.celebrate();                // From Birthday
        System.out.println("--------------------------");

        surprise.decorate();                // Own method
        surprise.cakeCutting();             // Own method
        surprise.cakeCutting(surprise);     // Pass object
        surprise.cakeCutting(null);         // Pass null
        System.out.println("==========================");
    }
}

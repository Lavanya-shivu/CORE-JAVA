package com.java.runner;

import com.java.external.Airconditioner.SurpriseBirthday;
import com.java.internal.Birthday;

public class BirthdayRunner {
    public static void main(String[] args) {
        Birthday birthday = new Birthday("Fifteen",23);
        Birthday birthday1 = new Birthday();
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

package com.java.runner;

import com.java.external.Airconditioner.LeatherCase;

public class PhoneCaseRunner {
    public static void main(String[] args) {
        LeatherCase leatherCase = new LeatherCase();
        leatherCase.protect();               // From base class
        System.out.println("--------------------------");

        leatherCase.flipCover();             // Subclass method
        leatherCase.close();                 // Subclass method
        leatherCase.close(leatherCase);      // With object
        leatherCase.close(null);             // With null
        System.out.println("==========================");
    }
}

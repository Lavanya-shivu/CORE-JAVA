package com.java.external.Airconditioner;

import com.java.internal.Fork;

public class SilverFork extends Fork {
    public SilverFork() {
        System.out.println("No-argument constructor in SilverFork");
    }

    public void polish() {
        System.out.println("Polishing the silver fork.");
    }

    public void clean() {
        System.out.println("Silver fork is being cleaned.");
    }

    public void clean(Fork fork) {
        if (fork != null) {
            System.out.println("Cleaning the fork with care.");
        } else {
            System.out.println("No fork to clean.");
        }
    }
}

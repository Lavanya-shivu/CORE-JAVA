package com.java.external.Airconditioner;

import com.java.internal.Cartoon;

public class TomAndJerry extends Cartoon {
    public TomAndJerry() {
        System.out.println("No-argument constructor in TomAndJerry");
    }

    public void chase() {
        System.out.println("Tom is chasing Jerry around the house!");
    }

    public void laugh() {
        System.out.println("Jerry is laughing after outsmarting Tom!");
    }

    public void laugh(Cartoon cartoon) {
        if (cartoon != null) {
            System.out.println("Cartoon characters are making everyone laugh.");
        } else {
            System.out.println("No cartoon to laugh at.");
        }
    }
}

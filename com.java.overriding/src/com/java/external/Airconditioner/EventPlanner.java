package com.java.external.Airconditioner;

import com.java.internal.Birthday;

public class EventPlanner {
    public void organize(Birthday birthday) {
        if (birthday != null) {
            System.out.println("Planning a birthday event...");

            if (birthday instanceof SurpriseBirthday) {
                SurpriseBirthday surprise = (SurpriseBirthday) birthday;
                surprise.decorate();
                surprise.cakeCutting();
            } else {
                birthday.celebrate();
                System.out.println("Simple birthday celebration planned.");
            }
        } else {
            System.err.println("No birthday event to plan.");
        }
    }
}

package com.java.external.Airconditioner;

import com.java.internal.Dream;

public class LucidDream extends Dream {
    public LucidDream() {
        System.out.println("No-argument constructor in LucidDream");
    }

    public void control() {
        System.out.println("Controlling actions inside the dream.");
    }

    public void awaken() {
        System.out.println("Waking up from a dream.");
    }

    public void awaken(Dream dream) {
        if (dream != null) {
            System.out.println("Awoke from a vivid dream.");
        } else {
            System.out.println("No dream to awaken from.");
        }
    }
}

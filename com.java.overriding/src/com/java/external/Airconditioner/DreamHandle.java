package com.java.external.Airconditioner;

import com.java.internal.Dream;

public class DreamHandle {
    public void handleDream(Dream dream) {
        if (dream != null) {
            dream.sleep();

            if (dream instanceof LucidDream) {
                LucidDream lucidDream = (LucidDream) dream;
                lucidDream.control();
            } else {
                System.err.println("This is not a lucid dream.");
            }
        } else {
            System.err.println("No dream to handle.");
        }
    }
}

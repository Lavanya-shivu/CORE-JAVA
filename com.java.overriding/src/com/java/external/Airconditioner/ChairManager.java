package com.java.external.Airconditioner;

import com.java.internal.Chair;

public class ChairManager {
    public void manage(Chair chair) {
        if (chair != null) {
            System.out.println("Managing the chair...");

            if (chair instanceof ReclinerChair) {
                ReclinerChair recliner = (ReclinerChair) chair;
                recliner.adjustPosition();
                recliner.fold();
            } else {
                chair.sit();
                System.out.println("Sitting on the regular chair.");
            }
        } else {
            System.err.println("No chair to manage.");
        }
    }
}

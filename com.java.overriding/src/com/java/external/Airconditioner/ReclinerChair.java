package com.java.external.Airconditioner;

import com.java.internal.Chair;

public class ReclinerChair extends Chair {
    public ReclinerChair() {
        System.out.println("No-argument constructor in ReclinerChair");
    }

    public void adjustPosition() {
        System.out.println("Adjusting the recliner to a comfortable position.");
    }

    public void fold() {
        System.out.println("Folding the recliner chair.");
    }

    public void fold(Chair chair) {
        if (chair != null) {
            System.out.println("Folding the chair with reference.");
        } else {
            System.out.println("No chair provided to fold.");
        }
    }
}

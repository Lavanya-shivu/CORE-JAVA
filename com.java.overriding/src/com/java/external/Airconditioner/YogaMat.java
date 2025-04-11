package com.java.external.Airconditioner;

import com.java.internal.Mat;

public class YogaMat extends Mat {
    public YogaMat() {
        System.out.println("No-argument constructor in YogaMat");
    }

    public void rollOut() {
        System.out.println("Rolling out the yoga mat.");
    }

    public void clean() {
        System.out.println("Cleaning the yoga mat.");
    }

    public void clean(Mat mat) {
        if (mat != null) {
            System.out.println("Cleaning provided mat.");
        } else {
            System.out.println("No mat to clean.");
        }
    }
}

package com.java.runner;

import com.java.external.Airconditioner.YogaMat;

public class MatRunner {
    public static void main(String[] args) {
        YogaMat yogaMat = new YogaMat();
        yogaMat.use();
        System.out.println("--------------------------");

        yogaMat.rollOut();
        yogaMat.clean();
        yogaMat.clean(yogaMat);
        yogaMat.clean(null);
        System.out.println("==========================");
    }
}

package com.java.runner;

import com.java.external.Airconditioner.ReclinerChair;

public class ChairRunner {
    public static void main(String[] args) {
        ReclinerChair recliner = new ReclinerChair();
        recliner.sit();
        System.out.println("--------------------------");

        recliner.adjustPosition();
        recliner.fold();
        recliner.fold(recliner);
        recliner.fold(null);
        System.out.println("==========================");
    }
}

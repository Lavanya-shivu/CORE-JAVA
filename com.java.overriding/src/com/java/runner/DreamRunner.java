package com.java.runner;

import com.java.external.Airconditioner.LucidDream;

public class DreamRunner {
    public static void main(String[] args) {
        LucidDream dream = new LucidDream();
        dream.sleep();
        System.out.println("--------------------------");

        dream.control();
        dream.awaken();
        dream.awaken(dream);
        dream.awaken(null);
        System.out.println("==========================");
    }
}

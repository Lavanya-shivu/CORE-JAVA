package com.java.runner;

import com.java.external.Airconditioner.SnowFall;

public class SnowRunner {
    public static void main(String[] args) {
        SnowFall snow = new SnowFall();
        snow.freeze();
        System.out.println("--------------------------");

        snow.beauty();
        snow.melt();
        snow.melt(snow);
        snow.melt(null);
        System.out.println("==========================");
    }
}

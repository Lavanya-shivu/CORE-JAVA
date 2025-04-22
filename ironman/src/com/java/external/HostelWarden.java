package com.java.external;

import com.java.internal.rule.Hostel;

public class HostelWarden implements Hostel {
    public void timings() {
        System.out.println("Hostel timings should be followed by everyone");
    }
}
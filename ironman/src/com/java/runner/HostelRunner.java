package com.java.runner;

import com.java.external.HostelWarden;
import com.java.internal.rule.Hostel;

public class HostelRunner {
    public static void main(String[] args) {
        Hostel hostel = new HostelWarden();

        hostel.timings();
    }
}

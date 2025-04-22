package com.java.runner;

import com.java.external.PoliceStation;
import com.java.internal.rule.Police;

public class PoliceRunner {
    public static void main(String[] args) {
        Police police = new PoliceStation();

        police.complaint();
    }
}

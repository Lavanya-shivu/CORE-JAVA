package com.java.runner;

import com.java.external.Airconditioner.SmartHoverboard;

public class HoverboardRunner {
    public static void main(String[] args) {
        SmartHoverboard hover = new SmartHoverboard();
        hover.ride();
        System.out.println("--------------------------");

        hover.charge();
        hover.balance();
        hover.balance(hover);
        hover.balance(null);
        System.out.println("==========================");
    }
}

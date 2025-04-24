package com.java.runner;

import com.java.internal.Bag;
import com.java.internal.Handbag;

public class BagRunner {
    public static void main(String[] args) {
        Bag bag = new Bag("Black", 12);
        Handbag handbag = new Handbag();
        handbag.carry();
        System.out.println("--------------------------");

        handbag.items();
        handbag.pack();
        handbag.pack(handbag);
        handbag.pack(null);
        System.out.println("==========================");
    }
}

package com.java.runner;

import com.java.external.Airconditioner.DiningTable;

public class TableRunner {
    public static void main(String[] args) {
        DiningTable table = new DiningTable();
        table.placeItems();
        System.out.println("--------------------------");

        table.extend();
        table.clean();
        table.clean(table);
        table.clean(null);
        System.out.println("==========================");
    }
}

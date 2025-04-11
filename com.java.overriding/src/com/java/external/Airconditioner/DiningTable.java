package com.java.external.Airconditioner;

import com.java.internal.Table;

public class DiningTable extends Table {
    public DiningTable() {
        System.out.println("No-argument constructor in DiningTable");
    }

    public void extend() {
        System.out.println("Extending the dining table for more space.");
    }

    public void clean() {
        System.out.println("Cleaning the dining table.");
    }

    public void clean(Table table) {
        if (table != null) {
            System.out.println("Table cleaned using the given table instance.");
        } else {
            System.out.println("No table provided for cleaning.");
        }
    }
}

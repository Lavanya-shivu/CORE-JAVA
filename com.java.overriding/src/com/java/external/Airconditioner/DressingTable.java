package com.java.external.Airconditioner;

import com.java.internal.Table;

public class DressingTable {
    public void dressingTable(Table table){
        if(table!= null){
            if(table instanceof  DiningTable){
                DiningTable diningTable = (DiningTable) table;
                diningTable.clean();
                diningTable.extend();
            }
            else {
                table.placeItems();
                System.err.println("Table is Dressing table");
            }
        }
        else {
            System.err.println("Table is null");
        }
    }
}

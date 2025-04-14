package com.java.external.Airconditioner;

import com.java.internal.Cupborad;

public class CupboardManager {
    public void handle(Cupborad cupboard) {
        if (cupboard != null) {
            System.out.println("Handling the cupboard...");

            if (cupboard instanceof Storage) {
                Storage storage = (Storage) cupboard;
                storage.material();
                storage.close();
            } else {
                cupboard.open();
                System.out.println("Cupboard is now open.");
            }
        } else {
            System.err.println("No cupboard to handle.");
        }
    }
}

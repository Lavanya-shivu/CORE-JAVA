package com.java.external.Airconditioner;

import com.java.internal.NoteBook;

public class Classmate extends NoteBook {
    public Classmate() {
        System.out.println("No-argument constructor in SmartNotebook");
    }

    public void ruled() {
        System.out.println("Notebook is Ruled.");
    }

    public void close() {
        System.out.println("Closing the smart notebook.");
    }

    public void close(NoteBook notebook) {
        if (notebook != null) {
            System.out.println("Notebook closed and saved.");
        } else {
            System.out.println("No notebook found to close.");
        }
    }
}

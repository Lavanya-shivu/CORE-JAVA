package com.java.runner;

import com.java.external.Airconditioner.Classmate;

public class NoteBookRunner {
    public static void main(String[] args) {
        Classmate classmate = new Classmate();
        classmate.writeNotes();             // Base class method
        System.out.println("--------------------------");

        classmate.ruled();                  // Own method
        classmate.close();                  // Own method
        classmate.close(classmate);         // With object
        classmate.close(null);              // With null
        System.out.println("==========================");
    }
}

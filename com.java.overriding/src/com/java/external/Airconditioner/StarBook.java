package com.java.external.Airconditioner;

import com.java.internal.NoteBook;

public class StarBook {
    public void starBook(NoteBook noteBook){
    if(noteBook!= null) {
        if (noteBook instanceof Classmate) {
            Classmate classmate = (Classmate) noteBook;
            classmate.ruled();
            classmate.close();
        } else {
            noteBook.writeNotes();
            System.err.print("This notbook is star");
        }
    }else {
        System.err.print("Notbook is null");

        }
    }
    }


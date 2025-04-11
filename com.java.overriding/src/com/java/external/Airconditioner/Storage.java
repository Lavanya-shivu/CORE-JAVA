package com.java.external.Airconditioner;

import com.java.internal.Cupborad;

public class Storage extends Cupborad{
    public Storage() {
        System.out.println("No-argument constructor in ObjectCupboard");
    }

    public void material() {
        System.out.println("Cupboard is made of wood and has metal handles");
    }

    public void close() {
        System.out.println("Cupboard is closed");
    }

    public void close(Cupborad cupborad) {
        if (cupborad != null) {
            System.out.println("Cupboard is being locked");
        } else {
            System.out.println("No cupboard to close");
        }
    }
}

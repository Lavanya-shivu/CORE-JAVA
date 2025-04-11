package com.java.internal;

public class Player extends Pubg{
    public Player() {
        System.out.println("no argument constructor in Player");
    }

    public void enimies() {
        System.out.println("kill the enemies");
    }

    public void battle() {
        System.out.println("Default battle started!");
    }

    public void battle(Pubg pubg) {
        if (pubg != null) {
            System.out.println("Pubg is a battle");
        } else {
            System.out.println("battleground");
        }
    }
}

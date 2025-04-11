package com.java.runner;

import com.java.internal.Player;
import com.java.internal.Pubg;
import javafx.scene.shape.Circle;

public class PubgRunner {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.playing();
        System.out.println("--------------------------");

        player1.enimies();
        player1.battle();
        player1.battle(player1);
        player1.battle(null);
        System.out.println("==========================");
    }
    }



package com.java.internal;

public abstract class Pubg {
    private String playerName;
    private int kills;

    public Pubg(String playerName) {
        this.playerName = playerName;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void playing() {
        System.out.println("playing pubg");
    }
    @Override
    public String toString() {
        return "Pubg [Player: " + playerName + ", Kills: " + kills + "]";
    }
}

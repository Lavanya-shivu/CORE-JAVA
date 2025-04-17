package com.java.internal;

public class Gif {
    private String fileName;
    private int sizeInKB;
    public Gif() {
    }

    public Gif(String fileName, int sizeInKB) {
        this.fileName = fileName;
        this.sizeInKB = sizeInKB;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setSizeInKB(int sizeInKB) {
        this.sizeInKB = sizeInKB;
    }
    public void load() {

        System.out.println("Loading a basic GIF.");
    }
    @Override
    public String toString() {
        return "GIF [FileName: " + fileName + ", Size: " + sizeInKB + " KB]";
    }
}

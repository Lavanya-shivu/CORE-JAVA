package com.java.internal;

public class NoteBook {
    private String brand;
    private int pages;
    public NoteBook() {
        this.brand = "Unknown";
        this.pages = 0;
    }
    public NoteBook(String brand, int pages) {
        this.brand = brand;
        this.pages = pages;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void writeNotes() {
        System.out.println("Writing notes in the notebook.");
    }
    @Override
    public String toString() {
        return "NoteBook [Brand: " + brand + ", Pages: " + pages + "]";
    }
}

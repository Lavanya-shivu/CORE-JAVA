package com.java.internal;

public class Whiteboard {
    private String markerColor;
    private String size;

    public Whiteboard(String markerColor, String size) {
        this.markerColor = markerColor;
        this.size = size;
    }

    public void setMarkerColor(String markerColor) {
        this.markerColor = markerColor;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void write() {
        System.out.println("Writing on the whiteboard with marker.");
    }
    @Override
    public String toString() {
        return "Whiteboard [Marker Color: " + markerColor + ", Size: " + size + "]";
    }
}

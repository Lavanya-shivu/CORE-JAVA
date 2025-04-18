package internal;

import java.util.Objects;

public class Marker {

    private String color;
    private String brand;
    private boolean isRefillable;
    private String tipType;

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setIsRefillable(boolean isRefillable) {
        this.isRefillable = isRefillable;
    }

    public void setTipType(String tipType) {
        this.tipType = tipType;
    }

    @Override
    public String toString() {
        return "Marker{" + "color='" + color + ", brand='" + brand + ", isRefillable=" + isRefillable + ", tipType='" + tipType  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Marker) {
            Marker marker = (Marker) obj;
            if (Objects.equals(this.color, marker.color) &&
                    Objects.equals(this.brand, marker.brand) &&
                    Objects.equals(this.isRefillable,marker.isRefillable) &&
                    Objects.equals(this.tipType, marker.tipType)) {

                System.out.println("Marker match! Same ink, same energy.");
                return true;
            }
            System.out.println("Marker mismatch! This one draws the line differently.");
            return false;
        }
        System.err.println("That's not even a marker!");
        return false;
    }
}

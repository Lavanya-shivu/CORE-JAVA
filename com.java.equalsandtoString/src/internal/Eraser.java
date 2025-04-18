package internal;

import java.util.Objects;

public class Eraser {
    private String color;
    private String shape;
    private String brand;
    private boolean isDustFree;

    public void setColor(String color) {
        this.color = color;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setIsDustFree(boolean isDustFree) {
        this.isDustFree = isDustFree;
    }

    @Override
    public String toString() {
        return "Eraser{" + "color='" + color + ", shape='" + shape + ", brand='" + brand + ", isDustFree=" + isDustFree + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Eraser) {
            Eraser eraser = (Eraser) obj;
            if (Objects.equals(this.color, eraser.color) &&
                    Objects.equals(this.shape, eraser.shape) &&
                    Objects.equals(this.brand, eraser.brand) &&
                    Objects.equals(this.isDustFree,eraser.isDustFree)) {

                System.out.println("Erasers are matching. Neat and clean!");
                return true;
            }
            System.out.println("Erasers are not matching. Different erasing vibes.");
            return false;
        }
        System.err.println("Not an eraser. Can't compare.");
        return false;
    }
}

package internal;

import java.util.Objects;

public class Fridge {
    private String brand;
    private String color;
    private boolean isFull;
    private int temperature;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsFull(boolean isFull) {
        this.isFull = isFull;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Fridge{" + "brand='" + brand +", color='" + color + ", isFull=" + isFull + ", temperature=" + temperature + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fridge) {
            Fridge fridge = (Fridge) obj;
            if (Objects.equals(this.brand, fridge.brand) &&
                    Objects.equals(this.color, fridge.color) &&
                    Objects.equals(this.isFull,fridge.isFull) &&
            Objects.equals(this.temperature,fridge.temperature)) {
                System.out.println("Fridge is a perfect match! Cold as ice!");
                return true;
            }
            System.out.println("This fridge is not on the same page. Maybe it's out of order?");
            return false;
        }
        System.err.println("You passed something that's not a fridge! Are you trying to put food in a cupboard?");
        return false;
    }
}

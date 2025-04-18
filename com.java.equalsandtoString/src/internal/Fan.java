package internal;

import java.util.Objects;

public class Fan {
    private String brand;
    private String color;
    private String type;
    private int speed;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fan{" + "brand='" + brand + ", color='" + color + ", type='" + type +", speed=" + speed + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fan) {
            Fan fan = (Fan) obj;
            if (Objects.equals(this.brand, fan.brand) &&
                    Objects.equals(this.color, fan.color) &&
                    Objects.equals(this.type, fan.type) &&
                    Objects.equals(this.speed,fan.speed)) {
                System.out.println("Fan is Matching");
                return true;
            }
            System.out.println("Fan is Not Matching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}

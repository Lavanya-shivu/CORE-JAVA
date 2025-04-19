package internal;

import java.util.Objects;

public class Shampoo {
    private String brand;
    private String type;
    private int volume;
    private boolean isHerbal;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setHerbal(boolean isHerbal) {
        this.isHerbal = isHerbal;
    }

    @Override
    public String toString() {
        return "Shampoo{" + "brand='" + brand + ", type='" + type + ", volume=" + volume + ", isHerbal=" + isHerbal + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shampoo) {
            Shampoo shampoo = (Shampoo) obj;
            if (Objects.equals(this.brand, shampoo.brand) &&
                    Objects.equals(this.type, shampoo.type) &&
                    Objects.equals(this.volume,shampoo.volume) &&
            Objects.equals(this.isHerbal,shampoo.isHerbal)) {

                System.out.println("Shampoos are matching");
                return true;
            }
            System.out.println("Shampoos are not matching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}

package internal;

import java.util.Objects;

public class Duster {
    private String brand;
    private String color;
    private boolean isDusty;
    private String material;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsDusty(boolean isDusty) {
        this.isDusty = isDusty;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Duster{" + "brand='" + brand + ", color='" + color + ", isDusty=" + isDusty + ", material='" + material  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Duster) {
            Duster duster = (Duster) obj;
            if (Objects.equals(this.brand, duster.brand) &&
                    Objects.equals(this.color, duster.color) &&
                    Objects.equals(this.isDusty,duster.isDusty) &&
                    Objects.equals(this.material, duster.material)) {

                System.out.println("Duster match! Both are ready to clean with style.");
                return true;
            }
            System.out.println("Dusters do NOT match! Someone's clearly not dusting right.");
            return false;
        }
        System.err.println("That's not even a Duster. Who do you think you're fooling?");
        return false;
    }
}

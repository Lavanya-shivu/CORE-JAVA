package internal;

import java.util.Objects;

public class Sponge {
    private String shape;
    private String color;
    private boolean isWet;
    private String material;

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsWet(boolean isWet) {
        this.isWet = isWet;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Sponge{" + "shape='" + shape + ", color='" + color + ", isWet=" + isWet +", material='" + material  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sponge) {
            Sponge sponge = (Sponge) obj;
            if (Objects.equals(this.shape, sponge.shape) &&
                    Objects.equals(this.color, sponge.color) &&
                    Objects.equals(this.isWet,sponge.isWet) &&
                    Objects.equals(this.material, sponge.material)) {

                System.out.println("Sponge match! These soak the same vibes.");
                return true;
            }
            System.out.println("Sponges don't match! Someone's drying out.");
            return false;
        }
        System.err.println("That's not a sponge — don't trick me.");
        return false;
    }
}

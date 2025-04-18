package internal;

import java.util.Objects;

public class Chalk {
    private String color;
    private String brand;
    private int lengthInCm;
    private boolean isBroken;

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setLengthInCm(int lengthInCm) {
        this.lengthInCm = lengthInCm;
    }

    public void setIsBroken(boolean isBroken) {
        this.isBroken = isBroken;
    }

    @Override
    public String toString() {
        return "Chalk{" + "color='" + color + ", brand='" + brand + ", lengthInCm=" + lengthInCm + ", isBroken=" + isBroken + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chalk) {
            Chalk chalk = (Chalk) obj;
            if (Objects.equals(this.color, chalk.color) &&
                    Objects.equals(this.brand, chalk.brand) &&
                    Objects.equals(this.lengthInCm,chalk.isBroken)) {

                System.out.println("Chalk match! Same color, same attitude.");
                return true;
            }
            System.out.println("Chalk not matching! Someone's clearly a different stick.");
            return false;
        }
        System.err.println("Hey! That’s not even chalk.");
        return false;
    }
}

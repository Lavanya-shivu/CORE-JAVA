package internal;

import java.util.Objects;

public class Toothpaste {
    private String brand;
    private String flavor;
    private int weight;
    private boolean isWhitening;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setWhitening(boolean isWhitening) {
        this.isWhitening = isWhitening;
    }

    @Override
    public String toString() {
        return "Toothpaste{" + "brand='" + brand + ", flavor='" + flavor + ", weight=" + weight + ", isWhitening=" + isWhitening + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Toothpaste) {
            Toothpaste paste = (Toothpaste) obj;
            if (Objects.equals(this.brand, paste.brand) &&
                    Objects.equals(this.flavor, paste.flavor) &&
                    Objects.equals(this.weight,paste.weight) &&
            Objects.equals(this.isWhitening,paste.isWhitening)) {
                System.out.println("Toothpastes are matching");
                return true;
            }
            System.out.println("Toothpastes are not matching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}

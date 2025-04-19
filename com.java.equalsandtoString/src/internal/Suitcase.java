package internal;

import java.util.Objects;

public class Suitcase {
    private String material;
    private String color;
    private String brand;
    private String size;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "{ Suitcase" + "material=" + material + "color=" + color + "brand=" + brand + "size=" + size + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Suitcase) {
            Suitcase suitcase = (Suitcase) obj;
            if (Objects.equals(this.material,suitcase.material) &&
            Objects.equals(this.color,suitcase.color) &&
            Objects.equals(this.brand,suitcase.brand) &&
            Objects.equals(this.size,suitcase.size)){
                System.out.println("Suitcase are matching");
                return true;
            }
            System.out.println("Suitcase are not matching");
            return false;
        }
        System.out.println("Invalid Object");
        return false;
    }
}
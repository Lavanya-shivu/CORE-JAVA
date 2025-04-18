package internal;

import java.util.Objects;

public class Paper {
    private String size;
    private String color;
    private boolean isCrumpled;
    private String material;

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsCrumpled(boolean isCrumpled) {
        this.isCrumpled = isCrumpled;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "size='" + size + ", color='" + color + ", isCrumpled=" + isCrumpled + ", material='" + material + +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Paper) {
            Paper paper = (Paper) obj;
            if (Objects.equals(this.size, paper.size) &&
                    Objects.equals(this.color, paper.color) &&
                    Objects.equals(this.isCrumpled, paper.isCrumpled) &&
                    Objects.equals(this.material, paper.material)) {
                System.out.println("Paper is a perfect match! It's smooth and wrinkle-free.");
                return true;
            }
            System.out.println("Paper is not matching! This one’s been crumpled or not treated well.");
            return false;
        }
        System.err.println("You tried comparing paper with something else? That's just *sad*.");
        return false;
    }
}

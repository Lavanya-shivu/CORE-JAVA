package internal;

import java.util.Objects;

public class Cable {
    private String type;
    private String color;
    private int length;
    private boolean isFlexible;

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setFlexible(boolean isFlexible) {
        this.isFlexible = isFlexible;
    }

    @Override
    public String toString() {
        return "{Cable" + "type=" + type + "color=" + color + "length=" + length + "isFlexible=" + isFlexible + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cable) {
            Cable cable = (Cable) obj;
            if (Objects.equals(this.type, cable.type) &&
                    Objects.equals(this.color, cable.color) &&
                    Objects.equals(this.length, cable.length) &&
                    Objects.equals(this.isFlexible, cable.isFlexible)) {
                System.out.println("Cables are mathing");
                return true;
            }
            System.err.println("Cables are not matching");
            return false;
        }
        System.out.println("Inavlid Object");
        return false;
    }
}

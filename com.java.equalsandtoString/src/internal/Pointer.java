package internal;

import java.util.Objects;

public class Pointer {
    private String type;
    private String color;
    private int length;
    private boolean isLaser;

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setisLaser(boolean isLaser) {
        this.isLaser = isLaser;
    }
    @Override
    public String toString() {
        return "Pointer{" + "type='" + type + ", color='" + color + ", length=" + length + ", isLaser=" + isLaser + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pointer) {
            Pointer pointer = (Pointer) obj;
            if (Objects.equals(this.type, pointer.type) &&
                    Objects.equals(this.color, pointer.color) &&
                    Objects.equals(this.length, pointer.length) &&
                    Objects.equals(this.isLaser, pointer.isLaser)) {
                System.out.println("Pointers are matching");
                return true;
            }
            System.out.println("Pointers are not Matching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}


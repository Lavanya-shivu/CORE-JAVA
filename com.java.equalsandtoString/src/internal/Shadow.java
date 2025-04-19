package internal;

import java.util.Objects;

public class Shadow {
    private String shape;
    private String surface;
    private int length;
    private boolean isMoving;

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }

    @Override
    public String toString() {
        return "Shadow{" + "shape='" + shape + ", surface='" + surface + ", length=" + length + ", isMoving=" + isMoving + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Shadow) {
            Shadow shadow = (Shadow) obj;
            if (Objects.equals(this.shape, shadow.shape) &&
                    Objects.equals(this.surface, shadow.surface) &&
                    Objects.equals(this.length,shadow.length) &&
            Objects.equals(this.isMoving,shadow.isMoving)) {
                System.out.println("Shadows are matching");
                return true;
            }
            System.out.println("Shadows are not matching");
            return false;
        }
        System.out.println("Invalid object for comparison");
        return false;
    }
}

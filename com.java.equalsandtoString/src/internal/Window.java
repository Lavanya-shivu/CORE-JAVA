package internal;

import java.util.Objects;

public class Window {
    private String material;
    private String color;
    private String type;
    private int height;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Window{" + "material='" + material + ", color='" + color + ", type='" + type + ", height=" + height + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Window) {
            Window window = (Window) obj;
            if (Objects.equals(this.material, window.material) &&
                    Objects.equals(this.color, window.color) &&
                    Objects.equals(this.type, window.type) &&
                    Objects.equals(this.height,window.height) ) {
                System.out.println("Window is Matching");
                return true;
            }
            System.out.println("Window is Not Matching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }

}

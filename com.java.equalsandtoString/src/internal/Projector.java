package internal;

import java.util.Objects;

public class Projector {
    private String brand;
    private String resolution;
    private int brightness;
    private boolean isPortable;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setIsPortable(boolean isPortable) {
        this.isPortable = isPortable;
    }

    @Override
    public String toString() {
        return "Projector{" + "brand='" + brand + ", resolution='" + resolution + ", brightness=" + brightness + ", isPortable=" + isPortable + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Projector) {
            Projector projector = (Projector) obj;
            if (Objects.equals(this.brand, projector.brand) &&
                    Objects.equals(this.resolution, projector.resolution) &&
                    Objects.equals(this.brightness,projector.isPortable)) {
                System.out.println("Projectors are matching. Same light power!");
                return true;
            }
            System.out.println("Projectors are not matching. Different show.");
            return false;
        }
        System.err.println("Invalid object. Not a projector.");
        return false;
    }
}

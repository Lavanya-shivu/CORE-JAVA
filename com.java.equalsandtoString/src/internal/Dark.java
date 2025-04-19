package internal;

import java.util.Objects;

public class Dark {
    private String shade;
    private String intensity;
    private int duration; // in hours
    private boolean isScary;

    public void setShade(String shade) {
        this.shade = shade;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setScary(boolean isScary) {
        this.isScary = isScary;
    }

    @Override
    public String toString() {
        return "Dark{" + "shade='" + shade +  ", intensity='" + intensity + ", duration=" + duration +", isScary=" + isScary + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Dark) {
            Dark dark = (Dark) obj;
            if (Objects.equals(this.shade, dark.shade) &&
                    Objects.equals(this.intensity, dark.intensity) &&
                    Objects.equals(this.duration,dark.duration) &&
            Objects.equals(this.isScary,dark.isScary)) {
                System.out.println("Dark objects are matching");
                return true;
            }
            System.out.println("Dark objects are not matching");
            return false;
        }
        System.out.println("Invalid object passed for comparison");
        return false;
    }
}

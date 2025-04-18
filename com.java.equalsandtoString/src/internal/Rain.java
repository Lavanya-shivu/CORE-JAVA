package internal;

import java.util.Objects;

public class Rain {
    private String intensity;
    private String location;
    private int duration;
    private int rainfallAmount;

    public Rain(String intensity, String location, int duration, int rainfallAmount) {
        this.intensity = intensity;
        this.location = location;
        this.duration = duration;
        this.rainfallAmount = rainfallAmount;
    }

    @Override
    public String toString() {
        return "{ Rain" + "intensity=" + intensity + "location=" + location + "duration=" + duration + "rainfallAmount=" + rainfallAmount + '}';

    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Rain) {
            Rain rain = (Rain) obj;
            if (Objects.equals(this.intensity, rain.intensity) &&
                    Objects.equals(this.location, rain.location) &&
                    Objects.equals(this.duration,rain.duration) &&
            Objects.equals(this.rainfallAmount,rain.rainfallAmount)) {

                System.out.println("Rain is Matching");
                return true;
            }
            System.out.println("Rain is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}

package internal;

import java.util.Objects;

public class Storm {
    private String name;
    private String category;
    private int windSpeed;      // in km/h
    private int pressure;       // in hPa

    public Storm(String name, String category, int windSpeed, int pressure) {
        this.name = name;
        this.category = category;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "{ Strome" + "name=" +name+ "category=" + category+ "windSpeen=" +windSpeed+ "pressure=" + pressure+ '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Storm) {
            Storm storm = (Storm) obj;
            if (Objects.equals(this.name, storm.name) &&
                    Objects.equals(this.category, storm.category) &&
                    Objects.equals(this.windSpeed,storm.windSpeed) &&
            Objects.equals(this.pressure,storm.pressure)) {

                System.out.println("Storm is Matching");
                return true;
            }
            System.out.println("Storm is NotMatching");
            return false;
        }
        System.err.println("Invalid object passed for comparison");
        return false;
    }
}

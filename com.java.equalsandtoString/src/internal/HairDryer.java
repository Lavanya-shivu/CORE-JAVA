package internal;

import java.util.Objects;

public class HairDryer {
    private String brand;
    private String color;
    private int wattage;
    private int cost;

    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setWattage(int wattage){
        this.wattage=wattage;
    }
    public void setCost(int cost){
        this.cost=cost;
    }
    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof HairDryer){
            HairDryer hairDryer = (HairDryer) obj;
            if(Objects.equals(this.brand,hairDryer.brand) &&
            Objects.equals(this.color,hairDryer.color) &&
            Objects.equals(this.wattage,hairDryer.wattage) &&
            Objects.equals(this.cost,hairDryer.cost)){
                System.out.println("HairDryers are Matching");
                return true;
            }
            System.out.println("HairDryers are not Matching");
            return false;
        }
        System.err.println("Invalid Object");
        return false;
    }
}

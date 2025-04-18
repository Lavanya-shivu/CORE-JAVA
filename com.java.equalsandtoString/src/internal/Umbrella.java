package internal;

import java.util.Objects;

public class Umbrella {
    private String color;
    private String brand;
    private int prize;
    private String size;

    public Umbrella(String color, String brand, int prize, String size){
        this.color = color;
        this.brand = brand;
        this.prize = prize;
        this.size= size;
    }
    @Override
    public String toString()
    {
        return "Umbrella{" + "color=" + color + ", brand=" + brand + ", prize=" + prize + ",size=" + size + '}';
    }
 @Override
    public boolean equals(Object obj){
        if(obj!= null && obj instanceof Umbrella){
            Umbrella umbrella = (Umbrella) obj;
            if(Objects.equals(this.color, umbrella.color) &&
            Objects.equals(this.brand, umbrella.brand) &&
            Objects.equals(this.prize, umbrella.prize) &&
            Objects.equals(this.size, umbrella.size)){
                System.out.println("Umbrella is mataching");
                return true;
            }
        }
        System.err.println("Umbrella is not matching");
        return  false;
 }

}

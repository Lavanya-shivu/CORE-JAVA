package internal;

import java.util.Objects;

public class Plastic {
    private String type;
    private String color;
    private int quantity;
    private String grade;

    public Plastic(String type,String color,int quantity,String grade){
        this.type=type;
        this.color=color;
        this.quantity=quantity;
        this.grade=grade;
    }
    @Override
    public String toString(){
        return "Plastic{" + "type=" + type + "color=" + color + "quantity=" + quantity + "grade=" + grade +'}';
    }
    @Override
    public boolean equals(Object obj){
        if(obj != null && obj instanceof Plastic){
            Plastic plastic = (Plastic) obj;
            if(Objects.equals(this.type, plastic.type) &&
            Objects.equals(this.color,plastic.color) &&
            Objects.equals(this.quantity,plastic.quantity) &&
            Objects.equals(this.grade, plastic.grade)){
                System.out.println("Plastic is matching");
             return true;
            }
        }
        System.out.println("Plastic is not matching");
        return false;
    }
}

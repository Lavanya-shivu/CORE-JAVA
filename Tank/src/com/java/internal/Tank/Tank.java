package com.java.internal.Tank;

public class Tank {
    private String Brand="Raj";
    private String Color= "White";
    private double Capacity = 28.5;
    private double Prize= 2500;
    private boolean Worth = false;
    //setter or mutator(init)
    void setBrand(String Brand) {
        this.Brand = Brand;
    }
    void setColor(String color){
        this.Color=color;
    }
    void setCapacity(double capacity){
        this.Capacity=capacity;
    }
    void setPrize(double prize){
        this.Prize=prize;
    }
    void setWorth(boolean worth){
        this.Worth=worth;
    }
    //getter or accessor
    public String getBrand(){
        return Brand;
    }
    public String getColor() {
        return Color;
    }

    public double getCapacity() {
        return Capacity;
    }

    public double getPrize() {
        return Prize;
    }

    public boolean isWorth() {
        return Worth;
    }
}

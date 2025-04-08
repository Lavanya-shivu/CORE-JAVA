package com.java.internal.Badge;

public class Badge {
    private String Name="NCC";
    private String Color="Blue";
    private String Material="velvet";
    private double Prize=100;
    private boolean Valid=true;
    //setter or mutator(init)
    void setName(String Name) {
        this.Name = Name;
    }
    void setColor(String Color){
        this.Color=Color;
    }
    void setMaterial(String Material){
        this.Material=Material;
    }
    void setPrize(double Prize){
        this.Prize=Prize;
    }
    void setValid(boolean Valid){
        this.Valid=Valid;
    }
    //getter or accessor
    public String getName(){
        return Name;
    }
    public String getColor() {
        return Color;
    }

    public String getMaterial() {
        return Material;
    }

    public double getPrize() {
        return Prize;
    }

    public boolean isValid() {
        return Valid;
    }
}

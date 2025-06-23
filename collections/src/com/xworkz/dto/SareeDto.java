package com.xworkz.dto;

public class SareeDto {
    private String type;
    private String material;
    private double price;
    private String color;

    public SareeDto(String type,String material,double price,String color){
        this.type=type;
        this.material=material;
        this.price=price;
        this.color=color;
    }
    @Override
    public String toString(){
        return "SareeDto{"+
                "type='"+type+'\''+
                ",material='"+material+'\''+
                ",price="+price+
                ",color='"+color+'\''+
                '}';
    }
    public String getType(){
        return type;
    }
    public String getMaterial(){
        return material;
    }
    public double getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
}

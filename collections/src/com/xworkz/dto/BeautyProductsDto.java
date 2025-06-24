package com.xworkz.dto;

public class BeautyProductsDto {
    private String type;
    private String form;
    private double price;
    private String color;
    private String skinType;

    public BeautyProductsDto(String type,String form,double price,String color,String skinType){
        this.type=type;
        this.form= form;
        this.price= price;
        this.color=color;
        this.skinType=skinType;
    }

    @Override
    public String toString() {
        return "BeautyProductsDto{"+
                "type='"+type+'\''+
                ",form='"+form+'\''+
                ",price="+price+
                ",color='"+color+'\''+
                ",skinType='"+skinType+'\''+
                '}';
    }
    public String getType(){
        return type;
    }
    public String getForm(){
        return form;
    }
    public double getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }
    public String getSkinType(){
        return skinType;
    }
}

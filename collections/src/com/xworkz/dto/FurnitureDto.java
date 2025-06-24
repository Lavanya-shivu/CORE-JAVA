package com.xworkz.dto;

public class FurnitureDto {
    private String type;
    private String material;
    private double cost;
    private String size;

    public FurnitureDto(String type,String material,double cost,String size){
        this.type=type;
        this.material=material;
        this.cost=cost;
        this.size=size;
    }

    @Override
    public String toString() {
        return "FurnitureDto{"+
                "type'"+type+'\''+
                ",material'"+material+'\''+
                ",cost"+cost+
                ",size'"+size+'\''+
                '}';
    }
    public String getType(){
        return type;
    }
    public String getMaterial(){
        return material;
    }
    public double getCost(){
        return cost;
    }
    public String getSize(){
        return size;
    }
}

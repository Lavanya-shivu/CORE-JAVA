package com.xworkz.node.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Objects;
@Getter
@Setter
@ToString
public class SweetDto {
    private String name;
    private double price;
    private String[] ingredients = new String[5];
    private int quantity;
    private String pack;

    public SweetDto(String name,double price,String[] ingredients,int quantity,String pack){
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.pack = pack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,price);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof SweetDto){
                SweetDto casted =(SweetDto) obj;
                return Arrays.equals(this.ingredients,casted.ingredients) && Objects.equals(name,casted.name);
            }
        }
        return  false;
    }
}

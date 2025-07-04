package com.xworkz.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SareeDto implements Comparable<SareeDto> {
    private String type;
    private String material;
    private double price;
    private String color;

    @Override
    public int compareTo(SareeDto o) {
        System.out.println("running compareTo..");
        SareeDto leftSide = this;
        SareeDto rightSide = o;
        if(leftSide.price==rightSide.price){
            return 0;
        }
        else if(leftSide.price>rightSide.price)
        {
            return 20;
        }
        return -20;
    }
}

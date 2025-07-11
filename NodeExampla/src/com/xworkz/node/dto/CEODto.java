package com.xworkz.node.dto;

import java.util.Objects;

public class CEODto {
    private String name;
    private int age;
    private String companyName;
    private int yearsInPosition;

    public CEODto(String name,int age, String companyName, int yearsInPosition){
        this.name = name;
        this.age = age;
        this.companyName = companyName;
        this.yearsInPosition = yearsInPosition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof CEODto){
                CEODto casted = (CEODto) obj;
                return casted.equals(casted.companyName) && this.yearsInPosition == casted.yearsInPosition;
            }
        }
        return false;
    }
}

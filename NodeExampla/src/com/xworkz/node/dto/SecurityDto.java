package com.xworkz.node.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;
@Getter
@Setter
@ToString

public class SecurityDto {
    private String name;
    private int age;
    private String shift;
    private String assignedArea;

    public SecurityDto(String name,int age,String shift, String  assignedArea){
        this.name = name;
        this.age = age;
        this.shift = shift;
        this.assignedArea = assignedArea;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age,shift,assignedArea);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof SecurityDto){
                SecurityDto casted = (SecurityDto) obj;
return this.equals(casted.name) && this.age == casted.age && this.shift == casted.shift && this.assignedArea == casted.assignedArea;
            }
        }
        return false;
    }
}

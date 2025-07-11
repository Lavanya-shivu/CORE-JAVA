package com.xworkz.node.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;
@Getter
@Setter
@ToString

public class JobDto {
    private String role;
    private double salary;
    private String location;
    private String department;

    public JobDto(String role,double salary,String location,String department){
        this.role = role;
        this.salary = salary;
        this.location = location;
        this.department = department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(role,salary,location,department);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof JobDto){
                JobDto casted = (JobDto) obj;
                return this.equals(casted.role) && this.salary == casted.salary && this.location==(casted.location) && this.department == casted.department;
            }
        }
        return false;
    }
}

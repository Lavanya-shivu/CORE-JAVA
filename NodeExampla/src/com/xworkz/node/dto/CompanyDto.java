package com.xworkz.node.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;
import java.util.jar.JarOutputStream;

@Getter
@Setter
@ToString
public class CompanyDto implements Comparable<CompanyDto>{
    private String name;
    private String industryType;
    private String headquarter;
    private int establishedYear;

    public CompanyDto(String name,String industryType,String headquarter,int establishedYear){
        this.name = name;
        this.industryType = industryType;
        this.headquarter  = headquarter;
        this.establishedYear = establishedYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,industryType);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof CompanyDto){
                CompanyDto casted = (CompanyDto) obj;
                return this.equals(casted.headquarter) && this.establishedYear == casted.establishedYear;
            }
        }
        return false;
    }

    @Override
    public int compareTo(CompanyDto o) {
        return this.name.compareTo(o.name);
    }
}

package com.xworkz.node.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;
@Getter
@Setter
@ToString
public class EducationDto {
    private String degree;
    private String university;
    private int passingYear;
    private double percentage;

    public EducationDto(String degree, String university, int passingYear, double percentage) {
        this.degree = degree;
        this.university = university;
        this.passingYear = passingYear;
        this.percentage = percentage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(degree,university,passingYear,percentage);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof EducationDto){
                EducationDto casted = (EducationDto) obj;
                return this.equals(casted.degree) && this.university == casted.university && this.passingYear == casted.passingYear && this.percentage == casted.percentage;
            }
        }
        return false;
    }
}

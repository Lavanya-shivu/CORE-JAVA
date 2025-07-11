package com.xworkz.node.dto;

import java.util.Objects;

public class PresidentDto {
    private String name;
    private int age;
    private String country;
    private int termYear;

    public PresidentDto(String name, int age, String country, int termYear) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.termYear = termYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof PresidentDto) {
                PresidentDto casted = (PresidentDto) obj;
                return this.equals(casted.country) && this.termYear == casted.termYear;
            }
        }
        return false;
    }
}
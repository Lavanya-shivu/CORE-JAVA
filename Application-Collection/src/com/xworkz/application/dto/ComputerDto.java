package com.xworkz.application.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class ComputerDto {
    private int windows;
    private double price;
    private String version;
    private int warrenty;

    public ComputerDto(int windows, double price, String version, int warrenty) {

    }

    @Override
    public int hashCode() {
        return Objects.hash(windows, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof ComputerDto) {
                ComputerDto casted = (ComputerDto) obj;
                return this.equals(casted.windows) && this.price == casted.price;

            }
        }
        return false;
    }
}

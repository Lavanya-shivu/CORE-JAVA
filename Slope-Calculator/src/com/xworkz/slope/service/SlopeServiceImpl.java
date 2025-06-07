package com.xworkz.slope.service;

import com.xworkz.slope.dto.SlopeDto;

public class SlopeServiceImpl implements SlopeService{
    @Override
    public void calculateSlope(SlopeDto slopeDto) {
        try{
            if(slopeDto == null){
                throw new NullPointerException("SlopeDto is null");
            }
            double x1 = slopeDto.getX1();
            double y1 = slopeDto.getY1();
            double x2 = slopeDto.getX2();
            double y2 = slopeDto.getY2();

            double slope = (y2-y1)/(x2-x1);
            System.out.println("The slope is:" +slope);
        }catch (ArithmeticException | NullPointerException e){
            System.out.println("Error:" +e.getMessage());
        }catch (Exception e){
            System.out.println("Unexpected error occurred");
        }
    }
}

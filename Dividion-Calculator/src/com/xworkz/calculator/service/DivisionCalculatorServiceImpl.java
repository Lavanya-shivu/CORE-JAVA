package com.xworkz.calculator.service;

import com.xworkz.calculator.dto.DivisionCalculatorDto;

public class DivisionCalculatorServiceImpl implements DivisionCalculatorService{

    @Override
    public int divide(DivisionCalculatorDto divisionCalculatorDto) throws ArithmeticException {

    if(divisionCalculatorDto == null){
        throw new NullPointerException("DivisionCalculatorDto is null");
    }
        int numerator = divisionCalculatorDto.getNumerator();
int denominator = divisionCalculatorDto.getDenominator();

return numerator / denominator;

}
    }


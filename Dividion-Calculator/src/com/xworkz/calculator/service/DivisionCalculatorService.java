package com.xworkz.calculator.service;

import com.xworkz.calculator.dto.DivisionCalculatorDto;

public interface DivisionCalculatorService {
    int divide(DivisionCalculatorDto divisionCalculatorDto)throws ArithmeticException;
}

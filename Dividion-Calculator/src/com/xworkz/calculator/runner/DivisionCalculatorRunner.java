package com.xworkz.calculator.runner;

import com.xworkz.calculator.dto.DivisionCalculatorDto;
import com.xworkz.calculator.service.DivisionCalculatorService;
import com.xworkz.calculator.service.DivisionCalculatorServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculatorRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the numerator");
            int numerator = scanner.nextInt();

            System.out.println("Enter the denominator");
            int denominator = scanner.nextInt();

            DivisionCalculatorDto divisionCalculatorDto = new DivisionCalculatorDto(numerator,denominator);
            DivisionCalculatorService divisionCalculatorService = new DivisionCalculatorServiceImpl();

            int result = divisionCalculatorService.divide(divisionCalculatorDto);
            System.out.println("Result:" +result);
        }
        catch (ArithmeticException e){
            System.out.println("Error: Can't divide by Zero");
        }catch (InputMismatchException e){
            System.out.println("Please enter the valid integer");
        }catch (NullPointerException e){
            System.out.println("Error: DivisionCalculatorDto is null");
        }finally {
            System.out.println("Division Completed");
        }
    }
}

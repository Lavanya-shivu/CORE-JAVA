package com.xworkz.lambdaRunner;

import com.xworkz.lambda.AppliancesLambda;

public class AppliancesLambdaRunner {
    public static void main(String[] args) {
        AppliancesLambda<Integer> loggingObject = (Integer val)->{
if(val>10){
    System.out.println("Logging");
}
        };
        loggingObject.accept(11);
    }
}

package com.xworkz.lambdaRunner;

import com.xworkz.lambda.BeautyProductsLambda;

public class BeautyProductsLambdaRunner {
    public static void main(String[] args) {
        BeautyProductsLambda<Integer> loggingObject = (Integer val)->{
            if(val>10){
                System.out.println("Logging");
            }
        };
        loggingObject.accept(11);
    }
}

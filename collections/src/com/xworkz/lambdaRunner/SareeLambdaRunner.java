package com.xworkz.lambdaRunner;

import com.xworkz.lambda.SareeLambda;

public class SareeLambdaRunner {
    public static void main(String[] args) {
        SareeLambda<Integer> logginObject = (Integer val)->{
            if(val>10){
                System.out.println("Logging");
            }
        };
        logginObject.accept(11);
    }
}

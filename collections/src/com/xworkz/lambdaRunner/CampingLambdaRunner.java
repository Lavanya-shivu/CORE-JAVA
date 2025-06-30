package com.xworkz.lambdaRunner;

import com.xworkz.lambda.CampingLambda;

public class CampingLambdaRunner {
    public static void main(String[] args) {
        CampingLambda<Integer> loggingObject = (Integer val)->{
          if(val>10){
              System.out.println("Logging");
          }
        };
        loggingObject.accept(11);
    }
}

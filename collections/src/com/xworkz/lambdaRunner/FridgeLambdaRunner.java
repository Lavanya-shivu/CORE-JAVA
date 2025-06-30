package com.xworkz.lambdaRunner;

import com.xworkz.lambda.FridgeLambda;

public class FridgeLambdaRunner {
    public static void main(String[] args) {
        FridgeLambda<Integer> loggingObject = (Integer val)->{
          if(val>10){
              System.out.println("Logging");
          }
        };
        loggingObject.accept(11);
    }
}

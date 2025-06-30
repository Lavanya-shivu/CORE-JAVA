package com.xworkz.lambdaRunner;

import com.xworkz.lambda.FurnitureLambda;

public class FurnitureLambdaRunner {
    public static void main(String[] args) {
        FurnitureLambda<Integer> loggingObject = (Integer val)->{
          if(val>10){
              System.out.println("Logging");
          }
        };
        loggingObject.accept(11);
    }
}

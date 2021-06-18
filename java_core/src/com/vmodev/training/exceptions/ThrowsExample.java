package com.vmodev.training.exceptions;

public class ThrowsExample{
    static int division(int a, int b) throws ArithmeticException{
        int t = a/b;
        return t;
    }
    public static void main(String args[]){
        try{
            System.out.println(ThrowsExample.division(15,0));
        }
        catch(ArithmeticException e){
            System.out.println("You shouldn't divide number by zero");
        }
    }
}

package com.vmodev.training.exceptions;

public class ThrowExample {
    static void checkAge(int age){
        if(age<18)
            throw new ArithmeticException("Not Eligible voting");
        else
            System.out.println("Eligible voting");
    }
    public static void main(String args[]){
        ThrowExample.checkAge(13);
        System.out.println("End Of Program");
    }
}


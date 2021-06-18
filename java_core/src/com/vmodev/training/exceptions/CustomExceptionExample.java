package com.vmodev.training.exceptions;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            checkParameter(0);
        } catch (CustomException ce) {
            System.out.println(ce.getMessage());
        }
    }

    static void checkParameter(int i) throws CustomException {
        if (i == 0) {
            throw new CustomException("Number is zero");
        }
    }
}

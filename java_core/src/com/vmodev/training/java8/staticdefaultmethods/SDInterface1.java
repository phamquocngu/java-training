package com.vmodev.training.java8.staticdefaultmethods;

public interface SDInterface1 {
    default void showMessage1() {
        System.out.println("This is default method of SDInterface1");
    }

    static void showMessage2() {
        System.out.println("This is static method of SDInterface1");
    }
}


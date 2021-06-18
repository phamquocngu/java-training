package com.vmodev.training.java8.staticdefaultmethods;

public interface SDInterface2 {
    default void showMessage1() {
        System.out.println("This is default method of SDInterface2");
    }

    static void showMessage2() {
        System.out.println("This is static method of SDInterface2");
    }
}

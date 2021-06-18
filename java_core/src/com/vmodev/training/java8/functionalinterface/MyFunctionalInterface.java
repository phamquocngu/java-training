package com.vmodev.training.java8.functionalinterface;

@FunctionalInterface
public interface MyFunctionalInterface {
    void showMessage(String s);
    int hashCode();
    String toString();
    boolean equals(Object obj);
}


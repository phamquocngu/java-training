package com.vmodev.training.collection;

public class Demo {

    private String name;

    public Demo(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    //finalize method
    public void finalize() {
        System.out.println("finalize method was called");
    }
}

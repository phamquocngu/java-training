package com.vmodev.training.oop;

public class MutableExample {
    private String name;

    public MutableExample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        MutableExample mutableExample = new MutableExample("MutableExample");
        System.out.println(mutableExample.getName());
        //Update name of MutableExample
        mutableExample.setName("New MutableExample");
        System.out.println(mutableExample.getName());
    }
}

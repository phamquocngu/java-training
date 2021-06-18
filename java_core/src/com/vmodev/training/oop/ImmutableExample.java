package com.vmodev.training.oop;

public class ImmutableExample {
    private String name;

    public ImmutableExample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //No setter
//    public void setName(String name) {
//        this.name = name;
//    }

    public static void main(String[] args) {
        ImmutableExample immutableExample = new ImmutableExample("ImmutableExample");
        System.out.println(immutableExample.getName());
        //Update name of MutableExample
//        mutableExample.setName("New MutableExample");
//        System.out.println(mutableExample.getName());
    }
}

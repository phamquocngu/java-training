package com.vmodev.training.oop.thiss;

public class Student2 {

    String name;
    String clazz;

    Student2() {
        this("name default", "class default");
        System.out.println("Default Constructor Student2");
    }

    Student2(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}

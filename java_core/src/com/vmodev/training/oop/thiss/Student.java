package com.vmodev.training.oop.thiss;

class Student {
    String name;
    String clazz;
    Student() {
        System.out.println("Default Constructor Student");
    }

    Student(String name, String clazz) {
        this();
        this.name = name;
        this.clazz = clazz;
        //Call to this must be first statement in constructor
        //this();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}

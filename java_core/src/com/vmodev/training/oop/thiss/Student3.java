package com.vmodev.training.oop.thiss;

public class Student3 {
    String name;
    String clazz;

    Student3() {
        System.out.println("Default Constructor Student2");
    }

    Student3(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    void displayWithParam(Student3 st){
        System.out.println(st);
    }
    void display(){
        displayWithParam(this);
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                '}';
    }
}

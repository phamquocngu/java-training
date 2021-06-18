package com.vmodev.training.oop.statics;

public class Example {
    int a; //non static
    static {
        System.out.println("Static block !!!");
    }

    public static void main(String[] args) {
        //static variable
        Student st1 = new Student("AA", "C1");
        Student st2 = new Student("BB", "C2");

        System.out.println(st1);
        System.out.println(st2);

        //static method
        Student.changeSchool("NEW-VMO");
        System.out.println(st1);
        System.out.println(st2);
//        System.out.println(a);
    }
}

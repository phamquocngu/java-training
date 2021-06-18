package com.vmodev.training.oop.thiss;

public class Example {
    public static void main(String[] args) {
        //using this to default constructor from parameterized constructor
        Student st = new Student("AAA", "C1");
        System.out.println("*****************************************");
        //using this to parameterized constructor from default constructor
        Student2 st2 = new Student2();
        System.out.println("*****************************************");
        //using this pass as an argument in the method
        Student3 st3 = new Student3("BBB", "C2");
        st3.display();
        System.out.println("*****************************************");
        //using this to return current class instance
        new Student4().getA().msg();
    }
}

package com.vmodev.training.java8.staticdefaultmethods;

public class SDInheritance implements SDInterface1, SDInterface2 {

    public void showMessage1() {
//        DefaultInterface1.super.showMessage();
//        DefaultInterface2.super.showMessage();
        System.out.println("This is showMessage1 of SDInheritance");
    }

    public static void main(String[] args) {
        SDInterface1 defaultInterface1 = new SDInheritance();
        SDInterface2 defaultInterface2 = new SDInheritance();
        defaultInterface1.showMessage1();
        defaultInterface2.showMessage1();
        SDInterface1.showMessage2();
        SDInterface2.showMessage2();
    }
}

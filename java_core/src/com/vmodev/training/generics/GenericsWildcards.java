package com.vmodev.training.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {
    public static void main(String[] args) {
        List<Number> ints = new ArrayList<>();
        ints.add(3); ints.add(5); ints.add(10);
        addIntegers(ints);
        double sum = sum(ints);
        printData(ints);
        System.out.println("\nSum of ints="+sum);
    }
    //Upper Bounded Wildcard
    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
    //Generics Unbounded Wildcard
    public static void printData(List<?> list){
        for(Object obj : list){
            System.out.print(obj + "::");
        }
    }
    //Upper Bounded Wildcard
    public static void addIntegers(List<? super Integer> list){
        list.add(new Integer(50));
    }

}

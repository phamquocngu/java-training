package com.vmodev.training.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate {
    public static void main(String[] args) {
        //Predicates
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Predicate<Integer> noLessThan8 = x -> x < 8;
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("List greater than 5: ");
        List<Integer> collect1 = list2.stream()
                .filter(noGreaterThan5)
                .collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("**********************");
        List<Integer> collect2 = list2.stream()
                .filter(noGreaterThan5.and(noLessThan8))
                .collect(Collectors.toList());
        System.out.println("List greater than 5 and less than 8: ");
        System.out.println(collect2);
    }
}

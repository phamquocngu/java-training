package com.vmodev.training.java8.optional;

import java.util.Optional;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        //Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");
        Predicate<String> p1 = p -> p.equals("GAME OF THRONES");
        Predicate<String> p2 = p -> p.equalsIgnoreCase("GAME OF THRONES");

        Optional<String> GOTFilter = GOT.filter(p1);
        System.out.println("Filter equals: " + GOTFilter);
        GOTFilter = GOT.filter(p2);
        System.out.println("Filter equalsIgnoreCase: " + GOTFilter);
    }
}

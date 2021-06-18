package com.vmodev.training.java8.optional;

import java.util.Optional;

public class OrElseOrElseGet {
    public static void main(String[] args) {
        //Creating Optional object from a String
        Optional<String> GOT = Optional.of("Game of Thrones");
        //Optional.empty() creates an empty Optional object
        Optional<String> nothing = Optional.empty();

        //Not Else
        System.out.println(GOT.orElse(getFunction("orElse")));
        System.out.println(GOT.orElseGet(() -> getFunction("orElseGet")));
        System.out.println("********************************");

        //Else
        System.out.println(nothing.orElse(getFunction("orElse")));
        System.out.println(nothing.orElseGet(() -> getFunction("orElseGet")));
    }

    public static String getFunction(String mess) {
        System.out.println("getFunction: " + mess);
        return "Default Value";
    }
}

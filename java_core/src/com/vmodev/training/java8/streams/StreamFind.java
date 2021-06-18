package com.vmodev.training.java8.streams;

import java.util.Arrays;
import java.util.Optional;

public class StreamFind {
    public static void main(String[] args) {
        Optional<?> op1 = Arrays.asList(1,2,3,4,5,6,7,8,9).stream()
                .findFirst();
        System.out.println("findFirst: " + op1);

        Optional<?> op2 = Arrays.asList(1,2,3,4,5,6,7,8,9).stream()
                .findAny();
        System.out.println("findAny: " + op2);

    }
}

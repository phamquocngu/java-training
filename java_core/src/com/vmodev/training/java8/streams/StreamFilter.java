package com.vmodev.training.java8.streams;

import java.util.Arrays;
import java.util.function.Predicate;

public class StreamFilter {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x>4;
        Arrays.asList(1,2,3,4,5,6,7).stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}


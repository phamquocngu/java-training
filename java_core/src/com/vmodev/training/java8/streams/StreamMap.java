package com.vmodev.training.java8.streams;

import java.util.Arrays;
import java.util.function.Function;

public class StreamMap {
    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        Arrays.asList("A", "BBB", "CCCC").stream()
                .map(function)
                .forEach(System.out::println);
    }
}

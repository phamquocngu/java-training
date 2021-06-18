package com.vmodev.training.java8.streams;

import java.util.Arrays;

public class StreamDistinct {
    public static void main(String[] args) {
        Arrays.asList(1,2,3,4,1,1).stream()
                .distinct()
                .forEach(System.out::println);
    }
}

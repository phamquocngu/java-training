package com.vmodev.training.java8.streams;

import java.util.Arrays;

public class StreamLimitSkip {
    public static void main(String[] args) {
        //Limit
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream()
                .limit(5)
                .forEach(System.out::println);
        System.out.println("*******");
        //Skip
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream()
                .skip(3)
                .forEach(System.out::println);
    }

}

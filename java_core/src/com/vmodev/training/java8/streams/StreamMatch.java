package com.vmodev.training.java8.streams;

import java.util.Arrays;
import java.util.function.Predicate;

public class StreamMatch {
    public static void main(String[] args) {
        Predicate<Integer> predicate = p -> p%3 ==0;
        boolean match = Arrays.asList(3,6,9).stream().allMatch(predicate);
        System.out.println("allMatch1 : " + match);
        match = Arrays.asList(3,6,7).stream().allMatch(predicate);
        System.out.println("allMatch2 : " + match);
        match = Arrays.asList(3,7,8).stream().anyMatch(predicate);
        System.out.println("anyMatch1: " + match);
        match = Arrays.asList(5,7,8).stream().anyMatch(predicate);
        System.out.println("anyMatch1: " + match);
        match = Arrays.asList(3,7,8).stream().noneMatch(predicate);
        System.out.println("noneMatch1: " + match);
        match = Arrays.asList(5,7,8).stream().noneMatch(predicate);
        System.out.println("noneMatch2: " + match);
    }
}

package com.vmodev.training.java8.streams;

import java.util.Arrays;

public class LazyExecute {
    public static void main(String[] args) {
        //Lazily executed
        Arrays.asList(1,2,3,4,12).stream()
                .map(a -> a * a)
                .filter(a -> a > 0 && a < 100)
                .map(a -> -a)
                .forEach(a -> System.out.println(a));
    }
}

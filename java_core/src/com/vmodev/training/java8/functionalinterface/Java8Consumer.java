package com.vmodev.training.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Java8Consumer {
    public static void main(String[] args) {
        //Consumer
        Consumer<String> consumer = (s) -> System.out.println(s.toUpperCase());
        List<String> lists = Arrays.asList("node", "c++", "java", "javascript");
        System.out.println("UpperCase Lists String: ");
        lists.stream().forEach(consumer);
        System.out.println("**********************");
        //BiConsumer
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        System.out.println("Add two number 2 and 5: ");
        addTwo.accept(2,5);
    }


}

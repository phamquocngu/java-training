package com.vmodev.training.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamMinMaxReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //Min
        System.out.println("Min: " + list.stream().min(Integer::compareTo));
        //Max
        System.out.println("Max: " + list.stream().max(Integer::compareTo));
        //Reduce
        System.out.println("Sum: " + list.stream().reduce(Integer::sum));
        System.out.println("Sum plus 1: " + list.stream().reduce(1, Integer::sum));
    }
}

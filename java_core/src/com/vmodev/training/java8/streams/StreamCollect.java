package com.vmodev.training.java8.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollect {
    public static void main(String[] args) {
        //String join
        String str = Arrays.asList("A","B","C").stream()
                .collect(Collectors.joining(","));
        System.out.println("String join: " + str);
        //toList
        List<?> list = Arrays.asList(1,2,3,4).stream()
                .map(x -> x*x)
                .collect(Collectors.toList());
        System.out.println("toList: " + list);
        //toSet
        Set<?> set = Arrays.asList(1,2,3,3).stream()
                .map(x -> x*x)
                .collect(Collectors.toSet());
        System.out.println("toSet: " + set);
        //toMap
        Function<String, String> key = x -> x;
        Function<String, String> value = x -> x;
        Map<?,?> map = Arrays.asList("A","B","C").stream()
                .collect(Collectors.toMap(key, value));
        System.out.println("toMap: " + map);
        //toArray
        Object[] a = Arrays.asList(1,2,3,4).stream()
                .map(x -> x*x)
                .toArray();
        System.out.println("toArray length of array : " + a.length);
        Arrays.asList(a).forEach(System.out::println);
    }
}

package com.vmodev.training.java8.functionalinterface;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8Function {
    public static void main(String[] args) {
        Function<String, Integer> func1 = x -> x.length();
        Function<String, Integer> func2 = String::length;
        Integer apply1 = func1.apply("Java Core Training"); //18
        Integer apply2 = func2.apply("Java Core Training"); //18
        System.out.println("Length of String(Java Core Training): " + apply1);
        System.out.println("Length of String(Java Core Training): " + apply2);
        System.out.println("******************************************");

        //Function using andThen
        Function<String, Integer> func3 = x -> x.length();
        Function<Integer, Integer> func4 = x -> x * 2;
        Integer apply3 = func3.andThen(func4).apply("Java Core Training");   //36
        System.out.println("x2 Length of String(Java Core Training): " + apply3);
        System.out.println("******************************************");

        //Function: List -> Map
        System.out.println("Size of element of Lists String: ");
        Java8Function obj = new Java8Function();
        List<String> list1 = Arrays.asList("node", "c++", "java", "javascript");
        // lambda
        Map<String, Integer> map1 = obj.convertListToMap(list1, x -> x.length());
        System.out.println(map1);    // {node=4, c++=3, java=4, javascript=10}
        // method reference
        Map<String, Integer> map2 = obj.convertListToMap(list1, obj::getLength);
        System.out.println(map2);
        System.out.println("******************************************");

        //Function: List -> List
        System.out.println("Get HashCode of element of Lists String: ");
        List<Integer> list2 = obj.convertListToList(list1, obj::getHashCode);
        System.out.println(list2);
        System.out.println("******************************************");

        // takes two Integers and return an Integer
        System.out.println("Sum 2 number using BiFunction: ");
        BiFunction<Integer, Integer, Integer> biFunc = (x1, x2) -> x1 + x2;
        Integer result = biFunc.apply(2, 3);
        System.out.println(result); // 5
        System.out.println("******************************************");

        // take two Integers and return an Double
        System.out.println("Power using BiFunction: ");
        BiFunction<Integer, Integer, Double> biFunc2 = (x1, x2) -> Math.pow(x1, x2);
        Double result2 = biFunc2.apply(2, 4);
        System.out.println(result2);    // 16.0
        System.out.println("******************************************");

        // take two Integers and return a List<Integer>
        System.out.println("Return List using BiFunction: ");
        BiFunction<Integer, Integer, List<Integer>> biFunc3 = (x1, x2) -> Arrays.asList(x1 + x2, x1 - x2, x1*x2);
        List<Integer> result3 = biFunc3.apply(2, 3);
        System.out.println(result3);
        System.out.println("******************************************");

        //BiFunction<T, U, R> + Function<T, R>
        //Math.pow(a1, a2) returns Double
        System.out.println("BiFunction<T, U, R> + Function<T, R>: ");
        BiFunction<Integer, Integer, Double> biFunc4 = (a1, a2) -> Math.pow(a1, a2);
        // takes Double, returns String
        Function<Double, String> func5 = (input) -> "Result : " + input;
        String result4 = biFunc4.andThen(func5).apply(2, 4);
        System.out.println(result4);

    }

    public <T,R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {
        Map<T, R> result = new HashMap<>();
        for (T t : list) {
            result.put(t, func.apply(t));
        }
        return result;
    }

    public Integer getLength(String str) {
        return str.length();
    }

    public <T, R> List<R> convertListToList(List<T> list, Function<T, R> func) {

        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(func.apply(t));
        }
        return result;
    }

    public int getHashCode(Object o) {
        return o.hashCode();
    }
}

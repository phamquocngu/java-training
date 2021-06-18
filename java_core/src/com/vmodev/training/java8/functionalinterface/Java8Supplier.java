package com.vmodev.training.java8.functionalinterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class Java8Supplier {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        //Supplier
        Supplier<LocalDateTime> s1 = () -> LocalDateTime.now();
        Supplier<LocalDateTime> s2 = LocalDateTime::now;
        System.out.println(s1.get());
        System.out.println(s2.get());
        Supplier<String> s3 = () -> dtf.format(LocalDateTime.now());
        System.out.println(s3.get());
    }
}

package com.vmodev.training.string;

import java.util.Arrays;
import java.util.List;

public class StringJoin {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(new String[]{"Hello", "World", "2021"});
        String msg1 = String.join(" ", words);
        String msg2 = String.join(" ", "Hello" , "World", "2021");
        System.out.println(msg1);
        System.out.println(msg2);
    }
}

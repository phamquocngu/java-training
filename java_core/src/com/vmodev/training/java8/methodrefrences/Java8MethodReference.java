package com.vmodev.training.java8.methodrefrences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8MethodReference {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,12,433,5);
        //Class::staticMethodName
        Optional<Integer> max = integers.stream().reduce(Math::max);
        max.ifPresent(value -> System.out.println(value));
        //ClassInstance::instanceMethodName
        max.ifPresent(System.out::println);

        List<String> strings = Arrays.asList("training", "java", "core");
        List<String> sorted = strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());
        System.out.println(sorted);
        //Class::instanceMethodName
        List<String> sortedAlt = strings.stream()
                .sorted(String::compareTo)
                .collect(Collectors.toList());
        System.out.println(sortedAlt);
        //Class::new
        List<Integer> integers2 = IntStream
                .range(1, 10)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(integers2);
        Optional<Integer> max2 = integers2.stream().reduce(Math::max);
        max2.ifPresent(System.out::println);
    }

}

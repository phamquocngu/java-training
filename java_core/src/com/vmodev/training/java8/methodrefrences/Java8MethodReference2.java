package com.vmodev.training.java8.methodrefrences;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8MethodReference2 {
    public static void main(String[] args) {
        Person p1 = new Person("B", LocalDate.of(1991,06,06),Person.Sex.MALE, "a@gmail.com");
        Person p2 = new Person("A", LocalDate.of(2000,07,07),Person.Sex.FEMALE, "a@gmail.com");
        List<Person> list = Arrays.asList(p2,p1);
        System.out.println(list);
        //Class::staticMethodName
        list.sort(Person::compareByAge);
        System.out.println(list);
        ComparisonProvider myComparisonProvider = new ComparisonProvider();
        //containingObject::instanceMethodName
        list.sort(myComparisonProvider::compareByName);
        System.out.println(list);
        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda" };
        //ContainingType::methodName
        Arrays.sort(stringArray, String::compareToIgnoreCase);
    }
}

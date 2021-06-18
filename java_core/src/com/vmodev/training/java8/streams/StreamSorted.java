package com.vmodev.training.java8.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSorted {
    public static void main(String[] args) {
        //Sorted using comparator default
        Arrays.asList(4,5,1,2,8,9,3,6,7).stream()
                .forEach(System.out::print);
        System.out.println("");
        System.out.println("*******************");
        Arrays.asList(4,5,1,2,8,9,3,6,7).stream()
                .sorted()
                .forEach(System.out::print);
        System.out.println("");
        System.out.println("*******************");
        //Sorted using comparator customize
        Comparator<Order> comparator = (o1, o2) -> o1.getId().compareTo(o2.getId());
        LineItem item = new LineItem(1, "apple", 1, new BigDecimal("1.20"), new BigDecimal("1.20"));
        Order order1 = new Order(1, "A0000001", Arrays.asList(item), new BigDecimal("2.20"));
        Order order2 = new Order(2, "A0000002", Arrays.asList(item), new BigDecimal("2.20"));
        Order order3 = new Order(3, "A0000003", Arrays.asList(item), new BigDecimal("2.20"));
        Order order4 = new Order(4, "A0000004", Arrays.asList(item), new BigDecimal("2.20"));
        List<Order> orders = Arrays.asList(order4, order1, order3, order2);
        orders.stream()
                .forEach(System.out::println);
        System.out.println("*******************");
        orders.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }
}

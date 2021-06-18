package com.vmodev.training.java8.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.Consumer;

public class StreamPeek {
    public static void main(String[] args) {
        LineItem item1 = new LineItem(1, "apple", 1, new BigDecimal("1.20"), new BigDecimal("1.20"));
        LineItem item2 = new LineItem(2, "orange", 2, new BigDecimal(".50"), new BigDecimal("1.00"));
        Order order1 = new Order(1, "A0000001", Arrays.asList(item1, item2), new BigDecimal("2.20"));
        System.out.println(order1);

        Consumer<Order> consumer = o -> o.setInvoice("consumer");
        Arrays.asList(order1).stream()
                .peek(consumer)
                .forEach(System.out::println);
    }
}

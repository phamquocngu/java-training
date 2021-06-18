package com.vmodev.training.java8.datetime;

import java.time.*;

public class Java8PeriodDuration {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2021, Month.DECEMBER, 12);
        Period gap = Period.between(date2, date1);
        System.out.println("gap between dates is a period of "+gap);
        System.out.println("****************************");
        LocalTime time1 = LocalTime.now();
        System.out.println("the current time is " + time1);
        Duration fiveHours = Duration.ofHours(5);
        // adding five hours to the current
        // time and storing it in time2
        LocalTime time2 = time1.plus(fiveHours);
        System.out.println("after adding five hours of duration " + time2);
        Duration gap2 = Duration.between(time2, time1);
        System.out.println("duraion gap between time1 & time2 is " + gap2);
    }
}

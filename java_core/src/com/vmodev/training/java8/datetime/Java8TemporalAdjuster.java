package com.vmodev.training.java8.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Java8TemporalAdjuster {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("the current date is "+ date);
        // to get the first day of next month
        LocalDate dayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("firstDayOfNextMonth : " + dayOfNextMonth );
        // get the next saturday
        LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("next satuday from now is "+ nextSaturday);
        // first day of current month
        LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("firstDayOfMonth : " + firstDay);
        // last day of current month
        LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("lastDayOfMonth : " + lastDay);
    }
}

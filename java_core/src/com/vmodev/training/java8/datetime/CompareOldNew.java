package com.vmodev.training.java8.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CompareOldNew {
    public static void main(String[] args) throws ParseException {
        //Getting current time
        Date oldNow = new Date();
        System.out.println("Old Now: " + oldNow);
        ZonedDateTime newNow = ZonedDateTime.now();
        System.out.println("New Now: " + newNow);
        System.out.println("***************************************");

        //Representing specific time
        Date oldBirthDay = new GregorianCalendar(1990, Calendar.DECEMBER, 15).getTime();
        System.out.println("oldBirthDay: " + oldBirthDay);
        LocalDate newBirthDay = LocalDate.of(1990, Month.DECEMBER, 15);
        System.out.println("newBirthDay: " + newBirthDay);
        System.out.println("***************************************");

        //Extracting specific fields
        int oldMonth = new GregorianCalendar().get(Calendar.MONTH);
        System.out.println("oldMonth: " + oldMonth);
        Month newMonth = LocalDateTime.now().getMonth();
        System.out.println("newMonth: " + newMonth);
        System.out.println("***************************************");

        //Adding and subtracting time
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.add(Calendar.HOUR_OF_DAY, -5);
        Date oldFiveHoursBefore = calendar.getTime();
        System.out.println("oldFiveHoursBefore: " + oldFiveHoursBefore);
        LocalDateTime newFiveHoursBefore = LocalDateTime.now().minusHours(5);
        System.out.println("newFiveHoursBefore:" + newFiveHoursBefore);
        System.out.println("***************************************");

        //Altering specific fields
        calendar.set(Calendar.MONTH, Calendar.JUNE);
        Date oldInJune = calendar.getTime();
        System.out.println("oldInJune: " + oldInJune);
        LocalDateTime newInJune = LocalDateTime.now().withMonth(Month.JUNE.getValue());
        System.out.println("newInJune: " + newInJune);
        System.out.println("***************************************");

        //Truncating
        Calendar now = Calendar.getInstance();
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.MILLISECOND, 0);
        Date oldTruncated = now.getTime();
        System.out.println("oldTruncated: " + oldTruncated);
        LocalTime newTruncated = LocalTime.now().truncatedTo(ChronoUnit.HOURS);
        System.out.println("newTruncated: " + newTruncated);
        System.out.println("***************************************");

        //Time zone conversion
        calendar.setTimeZone(TimeZone.getTimeZone("CET"));
        Date oldCentralEastern = calendar.getTime();
        System.out.println("oldCentralEastern: " + oldCentralEastern);
        ZonedDateTime newCentralEastern = LocalDateTime.now().atZone(ZoneId.of("CET"));
        System.out.println("newCentralEastern: " + newCentralEastern);
        System.out.println("***************************************");

        //Time span between two points in time
        Date now1 = new Date();
        calendar.add(Calendar.HOUR, 1);
        Date hourLater1 = calendar.getTime();
        long elapsed = hourLater1.getTime() - now1.getTime();
        System.out.println("Old Time span between two points in time (ms): " + elapsed);
        LocalDateTime now2 = LocalDateTime.now();
        LocalDateTime hourLater2 = LocalDateTime.now().plusHours(1);
        Duration span = Duration.between(now2, hourLater2);
        System.out.println("New Time span between two points in time (s): " + span.getSeconds());
        System.out.println("***************************************");

        //Time formatting and parsing
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate1 = dateFormat.format(new Date());
        Date parsedDate1 = dateFormat.parse(formattedDate1);
        System.out.println("Old Time formatting and parsing: " + parsedDate1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = LocalDate.now().format(formatter);
        LocalDate parsedDate2 = LocalDate.parse(formattedDate2, formatter);
        System.out.println("New Time formatting and parsing: " + parsedDate2);
        System.out.println("***************************************");

        //Number of days in a month
        int daysInMonth1 = new GregorianCalendar(1990, Calendar.FEBRUARY, 20).getActualMaximum(Calendar.DAY_OF_MONTH);
        int daysInMonth2 = YearMonth.of(1990, 2).lengthOfMonth();
        System.out.println("Old daysInMonth: " + parsedDate1);
        System.out.println("New daysInMonth: " + parsedDate2);

    }
}

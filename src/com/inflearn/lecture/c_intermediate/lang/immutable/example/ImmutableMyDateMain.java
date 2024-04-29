package com.inflearn.lecture.c_intermediate.lang.immutable.example;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date = new ImmutableMyDate(2024, 4, 29);
        ImmutableMyDate date2 = date;
        System.out.println(STR."date = \{date}");
        System.out.println(STR."date2 = \{date2}");

        ImmutableMyDate newYearDate = date2.withYear(2025);
        System.out.println("Year = " + date.getYear());
        System.out.println(STR."newYearDate = \{newYearDate}");

        ImmutableMyDate newMonthDate = date2.withMonth(5);
        System.out.println("Month = " + date.getMonth());
        System.out.println(STR."newMonthDate = \{newMonthDate}");

        ImmutableMyDate newDayDate = date2.withDay(30);
        System.out.println("Day = " + date.getDay());
        System.out.println(STR."newDayDate = \{newDayDate}");
    }
}

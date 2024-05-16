package com.inflearn.lecture.c_intermediate.date.temporal;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersMain {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 2, 17, 10, 10, 10);
        TemporalAdjuster next = dateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("next = " + next);

        LocalDateTime with = dateTime.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("with = " + with);
    }
}

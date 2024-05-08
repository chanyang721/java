package com.inflearn.lecture.c_intermediate.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DurationAndPeriod {
    public static void main(String[] args) {
        /*
        * 시간의 간격 표현
        *   Duration & Period
        *     - Period: 년, 월, 일 단위의 간격을 표현
        *     - Duration: 시, 분, 초, 나노초 단위의 간격을 표현
        * */
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        LocalDate plusDays = now.plusDays(10);

        /* Period */
        Period period = Period.between(now, plusDays); // 시간 사이 계산
        System.out.println("period = " + period.getDays()); // 10

        /* Period 객체 계산에 사용 */
        Period Day10 = Period.ofDays(10);
        LocalDate plusDay10 = now.plus(Day10);// plus 메서드 사용
        System.out.println("plusDay10 = " + plusDay10);

        /* 문제 */
        LocalDate date1 = LocalDate.of(2030, 10, 10);
        System.out.println("date1 = " + date1);
        LocalDate plusDays1 = date1.plusDays(40);
        System.out.println("plusDays1 = " + plusDays1);
        Period period1 = Period.between(date1, plusDays1);
        System.out.println("period M = " + period1.getMonths());
        System.out.println("period D = " + period1.getDays()); // Month는 계산 안함

        LocalDate date2 = LocalDate.of(2031, 4, 10);

        /* Duration */
        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);

        Duration durationOfHours10 = Duration.ofHours(10);
        System.out.println("durationOfHours10 = " + durationOfHours10.getSeconds());

        LocalTime localTime = LocalTime.of(10, 10);
        System.out.println("localTime = " + localTime);

        /* 계산 */
        LocalTime pluslt = localTime.plus(durationOfHours10);
        System.out.println("pluslt = " + pluslt);

        Duration between = Duration.between(timeNow, pluslt);
        System.out.println("between = " + between.toHours() + "시간" + between.toMinutes() + "분");

    }
}

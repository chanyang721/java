package com.inflearn.lecture.c_intermediate.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
    public static void main(String[] args) {
        /*
        * 날짜
        *   - 윤년, 타임존 등을 고려해서 정확한 시간을 구하는 것은 생각보다 어렵다.
        *
        * 날짜 클래스 특징
        *   - 모든 날짜 클래스는 불변 클래스
        * */

        /* 기본 날짜 */
        LocalDate newDate = LocalDate.now();
        System.out.println("newDate = " + newDate);

        LocalDate ofDate = LocalDate.of(2020, 2, 17);
        System.out.println("ofDate = " + ofDate);
        LocalDate plusDays = ofDate.plusDays(10); // 불변
        System.out.println("ofDate plus = " + plusDays);


        /* 기본 시간 */
        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);

        LocalTime oflocalTime = LocalTime.of(10, 10, 10);
        System.out.println("oflocalTime = " + oflocalTime);
        LocalTime plusSeconds = oflocalTime.plusSeconds(14);
        System.out.println("plusSeconds = " + plusSeconds);

        /* 기본 날짜 + 시간 */
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        LocalDateTime ofDt = LocalDateTime.of(2024, 2, 17, 10, 10, 10);
        System.out.println("oflocalDateTime = " + ofDt);

        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);


        /* 날짜 메서드 */
        LocalDateTime days = ofDt.plusDays(2304); // 날짜 더하기
        System.out.println("days = " + days);

        boolean before = ofDate.isBefore(ofDt.toLocalDate()); // 두 날짜 비교
        System.out.println("before = " + before);

        boolean after = ofDate.isAfter(ofDt.toLocalDate()); // 두 날짜 비교
        System.out.println("after = " + after);

        boolean equal = ofDate.isEqual(ofDt.toLocalDate()); // 두 날짜 비교
        System.out.println("equal = " + equal);
    }
}

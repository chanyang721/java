package com.inflearn.lecture.c_intermediate.date.temporal;

import java.time.temporal.ChronoField;

public class ChronoUnit {
    /*
    * 시간 관련 필드
    *   -
    * */
    public static void main(String[] args) {
        ChronoField[] chronoFields = ChronoField.values();

        for (ChronoField chronoField : chronoFields) {
            System.out.println("chronoField = " + chronoField + " | " + chronoField.range());

            System.out.println("ChronoField.HOUR_OF_DAY.range(); = " + ChronoField.HOUR_OF_DAY.range());
            System.out.println("ChronoField.HOUR_OF_DAY.range(); = " + ChronoField.AMPM_OF_DAY);
        }



    }

}

package com.inflearn.lecture.c_intermediate.date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone {
    public static void main(String[] args) {
        /*
        * 자바의 타임존
        *   - 자바는 타임존을 ZoneId 를 통해 제공
        *
        * UTC 기간
        *
        * Instant
        *   - 1970.01.01 00:00:00를 기준 경과한 시간을 UTC 기준 나노초로 표기한 객체
        *   - 내부에 초 데이터만 존재
        *   - 날짜와 시간을 계산하는 것에 부적합
        *   장점
        *       - 전세계에서 동일한 시점을 가리키는데 용이
        *       - 고정된 초로 시간 계산 및 비교에 용이
        *   단점
        *       - 기계 중심으로 시간을 표기하기 떄문에 시간으로 읽기 어렵다
        *       - 초 단위로 표기되어, 날짜와 시간을 알기 위해서는 추가 작업 필요
        *
        * Epoch (에포크) 시간 = unix timestamp
        *   - 컴퓨터 시스템 시간 표기 방법
        *   - 1970.01.01 00:00:00 이후 경과한 전체 초
        *   - 시간대에 영향을 받지 않는 절대적인 시간 표기
        * */
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules()); // 타임존 조회 & rules 확인
        }

        ZoneId systemedDefault = ZoneId.systemDefault(); // 시스템 타임존 조회
        System.out.println("systemedDefault = " + systemedDefault);

        /* 타임존을 포함한 날짜 */
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime); // 2024-05-08T14:17:13.148566+09:00[Asia/Seoul]


        /* 타임존 메서드 */
        long t = System.currentTimeMillis() - 600_000L;
        ZonedDateTime.ofInstant(Instant.ofEpochMilli(t), ZoneId.systemDefault());

        /* Instant */
        Instant instantNow = Instant.now(); // Instant 객체는 UTC 기준의 ISO 포맷 출력
        System.out.println(STR."instantNow = \{instantNow}");

        Instant ofEpochSecond = Instant.ofEpochSecond(0); // 시작 지점
        System.out.println("ofEpochSecond = " + ofEpochSecond); // 1970-01-01T00:00:00Z

        Instant ofEpochMilliZero = Instant.ofEpochMilli(0); // 시작 지점
        System.out.println("ofEpochMilliZero = " + ofEpochMilliZero); // 1970-01-01T00:00:00Z

        Instant plusSeconds = ofEpochSecond.plusSeconds(1000);
        System.out.println("plusSeconds = " + plusSeconds); // 1970-01-01T00:16:40Z

        Instant plusSeconds1 = ofEpochMilliZero.plusSeconds(1000);
        System.out.println("plusSeconds1 = " + plusSeconds1); // 1970-01-01T00:16:40Z

        Instant ofEpochMilli = Instant.ofEpochMilli(0); // Long 타입 밀리초 단위
        System.out.println("ofEpochMilli = " + ofEpochMilli);
        System.out.println("ofEpochMilli = " + Instant.ofEpochMilli(t));

        /* 에포크 시간 조회 */
        long epochSecond = plusSeconds1.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond); // 1000

    }


}

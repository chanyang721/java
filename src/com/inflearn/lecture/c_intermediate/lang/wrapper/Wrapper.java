package com.inflearn.lecture.c_intermediate.lang.wrapper;

public class Wrapper {
    public static void main(String[] args) {
        /*
         *   Wrapper 클래스란 ?
         *       - 객체 지향 언어인 자바에서 기본형 데이터 타입을 객체 형태로 정의한 클래스
         *
         *   Wrapper 사용 이유
         *       - 기본형 타입에 다양한 공통 메서드를 넣어 편리한 사용
         *       - 자바의 기본형 타입은 null(없는 상태)을 가질 수 없다
         *           - int a = null; // 에러
         *
         *   Wrapper Class 특징
         *       - 불변 객체
         *       - 비교 시 equals 사용 // 등등성 비교
         *
         *   박싱 (Boxing): 래퍼 클래스 생성
         *      - 기본형 데이터가 객체에 담기는 형태여서 박싱이라 함
         *   언박싱 (unBoxing): intValue()
         *      - 래퍼 클래스 내부의 데이터를 꺼내는 것을 말함
         *   오토박싱 (AutoBoxing):
         *      - 편의를 위해 박싱, 언박싱을 자동으로 함
         *
         *   타입 사용법
         *      - Integer.valueOf() // 래퍼 타입 반환
         *      - Integer.parseInt() // 기본 타입 반환
         *
         *   기본형 타입 vs 래퍼 타입
         *      - 속도에서 차이가 발생
         *      - 메모리 저장 형태
         *          - 기본형: 메모리에 데이터가 그대로 저장
         *          - 래퍼 타입: 객체 형태로 메모리를 사용
         *      - 반복문의 경우 10억번 기준 약 3배 정도 기본형 타입이 빠르다
         * */

        /* Wrapper */
        Integer newInteger = new Integer(10); // 자바에서 제거될 예정인 래퍼 클래스
        System.out.println("newInteger = " + newInteger);

        /*
         * 권장 사용
         *  - new Integer:
         * */
        Integer value = Integer.valueOf(100000); // 내부 데이터 로직 -128 ~ 127 검사 후 new Integer 리턴
        System.out.println("value = " + value);

        Integer integerObj = Integer.valueOf(10);  // 레퍼 타입 리턴
        int integerPri = Integer.parseInt("10"); // 기본형 타입 리턴
        System.out.println("integerObj.intValue() = " + integerObj.intValue());

        Long l = Long.valueOf(1000000000);
        System.out.println("l = " + l);

        /* equals */
        System.out.println(STR."== \{newInteger == integerObj}"); // 동일성 비교 false, 데이터 == 참조값 은 일치할 수 없음
        System.out.println(STR."equals: \{newInteger.equals(integerObj)}");

        /* auto boxing, auto unboxing */
        int value1 = 10;
        Integer int1 = value; // auto boxing
        int int2 = int1; // auto unboxing


    }
}

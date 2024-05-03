package com.inflearn.lecture.c_intermediate.lang.wrapper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Clazz {
    public static void main(String[] args) throws Exception { // throws 없다면 컴파일 오류 발생
        /*
        * Class 클래스란?
        *   - 실행중인 어플리케이션에서 사용되는 클래스의 메타 데이터를 다루는데 사용
        *   - class는 예약어이기 때문에, 패키지와 변수명으로 사용 불가능하다. -> 관형적으로 clazz로 사용
        *
        * Class 주요 기능
        *   - 타입 정보 조회:
        *       - .class로 필드, 메서드 정보 조회
        *   - 리플렉션
        *       - Class 클래스로 클래스 정보 조회, 메서드 호출, 인스턴스를 생성하는 작업을 말함
        *   - 동적 로딩, 생성
        *   - 애노테이션 처리: 추후 서술
        * */

        /* 클래스 조회 */
        Class clazz = String.class; // 클래스에서 조회
//        Class strClass = new String().getClass(); // 인스턴스에서 클래스 조회
//        Class<?> forName = Class.forName("java.lang.String"); // 문자열로 클래스 조회

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("field = " + field.getType() + "  " + field.getName());
        }

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(STR."declaredMethod = \{declaredMethod.getName()}");
        }
    }
}

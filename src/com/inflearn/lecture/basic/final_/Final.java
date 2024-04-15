package com.inflearn.lecture.basic.final_;

public class Final {
    // final + 필드 초기화를 하는 경우 static을 사용하여 클래스 상수로 사용하는 것이 메모리 낭비가 없다.
    private static final int FINAL_VALUE = 100; // 정적 클래스 상수 초기화
    private final int instanceFinalValue = 10; // 인스턴스 상수 필드 초기화
    // -> 모든 인스턴스가 공통값을 중복하여 가지고 있기 때문에 클래스 상수로 초기화 하는 것이 좋다

    private final int constructFinalValue; // 인스턴스 상수 생성자 초기화


    public Final(int constructFinalValue) {
        this.constructFinalValue = constructFinalValue;
    }

    public static void main(String[] args) {
        /*
        * final 변수와 상수
        *   - 사용하는 이유
        *       - 고정된 변수에 접근하여 변경 포인트를 최소화
        *       - 공통된 상수 값을 사용하여 인스턴스에 중복된 값을 생성하지 않아 메모리를 효율적으로 사용
        *
        *   - 사용처
        *       - 기본형 변수: 메모리 공간에 변수 값 변경 불가능
        *       - 참조형 변수: 메모리 공간에 참조 값 변경 불가능
        *
        *   - 특징
        *       - final 변수는 상수로서 변경 불가능
        *       - 상수는 대문자로 선언하여 구분
        *       - static final로 사용 -> js의 const 키워드
        *       - 기능이 아닌 고정된 값을 사용
        *       - 상수는 여러 인스턴스에서 public 접근 제어자로 접근
        *       - 상수는 런타임 상에서 변경 불가능하고, 프로그램 재시작으로 변경
        * */
        // 생성자 초기화
        Final final1 = new Final(1000);
        System.out.println("생성자 초기화: " + final1.constructFinalValue);

        // 필드 초기화
        Final final2 = new Final(1000);
        System.out.println("필드 초기화: " + final1.instanceFinalValue);

        // 클래스 상수
        System.out.println("클래스 상수: " + Final.FINAL_VALUE);

        // final 참조형
        final Data data = new Data();
        data.value = 10; // 참조값의 필드 변경 가능
//        data = new Data(); // 참조값 자체는 변경 불가능

        final int finalValue = 10;
//        finalValue = 20; // 컴파일 에러
    }
}

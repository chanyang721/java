package com.inflearn.lecture.b_basic.abstract_;

public abstract class AbstractAnimal {
    private static final String ABSTRACT_STATIC_FINAL = "TEST";

    public static void main(String[] args) { // 클래스 정의 시 실행되기 떄문에 사용 가능 ?
        /*
        * 추상 클래스틑 추상적인 개념을 클래스로 구체화한 것이다.
        *   - 실제 인스턴스 생성 목적이 아닌, 실제하는 개념에 상속을 목적으로 생성
        *   - 추상 클래스를 상속받는 자식은 반드시 추상 클래스의 모든 메서드를 구현해야 한다.
        *   - 제약이 걸린 일반 클래스로 메모리 상 작동은 일반 클래스와 동일하다
        *
        * 종류
        *   - 순수 추상 클래스 == 인터페이스
        *       - 모든 메서드가 추상 메서드인 경우
        *       - 다형성을 위해 사용된다.
        *   -
        * */
    }


    public abstract void sound(); // 추상 메서드는 구현부인 바디가 없다
}



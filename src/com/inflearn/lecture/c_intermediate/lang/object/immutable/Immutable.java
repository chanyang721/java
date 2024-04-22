package com.inflearn.lecture.c_intermediate.lang.object.immutable;

public class Immutable {
    public static void main(String[] args) {
        /*
        *
        * 불변 객체란 ?
        *   - 객체 내부의 값, 필드, 맴버 변수가 고정된 객체
        *
        * 불변 객체 생성 방법
        *   - 키워드 final 사용
        *   - 생성자 제외, set 메서드 제거
        *
        * 불변 객체의 필요성
        *   - 한 객체가 여러 변수에서 수정되는 것을 방지
        *   - 한 객체에 대한 가독성 상승
        *
        * 불변 객체가 필요한 원인
        *   - 자바의 변수 타입은 기본형, 참조형으로 나뉜다
        *   - 기본형은 같은 값을 다른 메모리 공간에 넣는다.
        *   - 참조형은 같은 참조값을 다른 메모리 공간에 넣는다.
        *       - 참조형의 경우 참조값으로 조회되기 때문에 여러 변수에서 조회 & 수정이 가능하다.
        *       - 여러 변수에서 하나의 객체에 대한 수정이 가능하기 때문에 사용자는 어느 객체에서 수정되는지 파악하기 힘들다.
        *
        * 불변 객체 관례
        *    - 새로운 불변 객체를 반환하는 메서드는 시작을 with로 시작한다
        * */
        int a = 10;
        System.out.println("a = " + a);
        int b = 10;
        System.out.println("b = " + b);

        ImmutableObject ImmutableObj = new ImmutableObject("이름", 10);
        System.out.println(ImmutableObj.getNumber()); // 10
        System.out.println(ImmutableObj); // 3f99bd52

        ImmutableObject newImmutableObj = ImmutableObj.add(10); // 불변 객체

        System.out.println(newImmutableObj.getNumber()); // 20
        System.out.println(newImmutableObj); // 4f023edb

        ImmutableObject newObj = ImmutableObj.withName("이름 변경");
        System.out.println(ImmutableObj.getName()); // 기존 객체
        System.out.println(newObj.getName()); // 새로운 불변 객체 생성
    }
}

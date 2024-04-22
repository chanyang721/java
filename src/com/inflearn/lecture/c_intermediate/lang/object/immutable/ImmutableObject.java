package com.inflearn.lecture.c_intermediate.lang.object.immutable;

public class ImmutableObject {
    private final String name; // final 키워드로 상수 처리
    private final int finalNumber;

    public ImmutableObject(String name, int finalNumber) {
        this.name = name; // 생성자에서 할당 후 변경 불가능
        this.finalNumber = finalNumber;
    }

    public static void main(String[] args) {
        /*
        *
        * */
    }

    public int getNumber () {
        return this.finalNumber;
    }

    public ImmutableObject add(int number) {
        /*
        * 불변 객체의 값 수정은 새로운 객체 전달을 의미
        * */
        int newNumber = this.finalNumber + number; // 새로운 불변 값 생성
        return new ImmutableObject(this.name, newNumber); // 새로운 객체 리턴
    }
}

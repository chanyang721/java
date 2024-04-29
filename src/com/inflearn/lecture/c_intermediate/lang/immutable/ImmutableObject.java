package com.inflearn.lecture.c_intermediate.lang.immutable;

public class ImmutableObject {
    private final String name; // 상수
    private final int finalNumber; // 상수

    public ImmutableObject(String name, int finalNumber) {
        this.name = name; // 생성자에서 할당 후 변경 불가능
        this.finalNumber = finalNumber;
    }

    public static void main(String[] args) {

    }

    public int getNumber () {
        return this.finalNumber;
    }

    public String getName() {
        return this.name;
    }

    public ImmutableObject add(int number) {
        /*
        * 불변 객체의 값 수정은 새로운 객체 전달
        * */
        int newNumber = this.finalNumber + number; // 새로운 불변 값 생성
        return new ImmutableObject(this.name, newNumber); // 새로운 객체 리턴
    }

    public ImmutableObject withName(String name) {
        return new ImmutableObject(name, this.finalNumber);
    }

    @Override
    public String toString() {
        return STR."ImmutableObject{name='\{name}\{'\''}, finalNumber=\{finalNumber}\{'}'}";
    }
}

package com.inflearn.lecture.c_intermediate.lang.object.ploy.car;

public class Bmw implements Car {

    @Override
    public String toString() {
        return "Bmw 오버라이딩 메서드";
    }

    @Override
    public void enginStart() {

    }

    @Override
    public void enginEnd() {

    }

    @Override
    public void pressAc() {

    }

    @Override
    public void pressBreak() {

    }

    @Override
    public void sound() {
        System.out.println("부릉");
    }
}

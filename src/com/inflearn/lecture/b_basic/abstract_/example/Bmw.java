package com.inflearn.lecture.b_basic.abstract_.example;

public class Bmw implements Car { // provider
    private static final String name = "BMW";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void startEngine() {
        System.out.println("Car Name: " + name + "  " + "자동차 시동 on");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car Name: " + name + "  " + "자동차 시동 stop");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Car Name: " + name + "  " + "자동차 전진");
    }

    @Override
    public void pressBreak() {
        System.out.println("Car Name: " + name + "  " + "자동차 멈춤");
    }
}

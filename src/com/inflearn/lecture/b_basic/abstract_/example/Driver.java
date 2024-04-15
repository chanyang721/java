package com.inflearn.lecture.b_basic.abstract_.example;

public class Driver {

    private Car car; // 역할은 역할에 의존한다.

    public void setCar(Car car) { // 역할의 구현부를 할당
        this.car = car;
    }

    public void drive() { // 구현부를 실행
        System.out.println("Car Name: " + car.getName());
        car.startEngine();
        car.pressAccelerator();
    }
}

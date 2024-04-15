package com.inflearn.lecture.b_basic.memoryAndStatic.problem;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("기아", 1000);
        Car car2 = new Car("현대", 2000);

        System.out.println("구매한 차량 수: " + Car.getBuyCount());
    }
}

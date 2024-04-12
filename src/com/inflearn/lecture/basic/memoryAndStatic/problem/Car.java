package com.inflearn.lecture.basic.memoryAndStatic.problem;

public class Car {
    private String name;
    private int price;
    private static int count;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;

        System.out.println("구매한 차량: " + name);
        System.out.println("구매한 차량 가격: " + price);
        Car.count++;
    }

    public static int getBuyCount() {
        return count;
    }
}

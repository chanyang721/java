package com.inflearn.lecture.c_intermediate.nested.example.inner;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }


    /*
    * 내부 클래스
    *   장점:
    *       - private 맴버에 접근 가능하여 Getter public 맴버 삭제 가능
    *       - Car Class 캡슐화 상향
    * */
    private class Engine {
        public void start() {
            System.out.println("충전 레벨: " + chargeLevel);
            System.out.println("Model = " + model + " 엔진 구동");
        }
    }

    public void start () {
        this.engine.start();
    }
}

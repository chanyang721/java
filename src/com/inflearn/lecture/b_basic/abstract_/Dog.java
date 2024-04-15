package com.inflearn.lecture.b_basic.abstract_;

public class Dog extends AbstractAnimal implements Fly {
    public static void main(String[] args) {

    }

    @Override
    public void sound() {
        System.out.println("월월");
    }

    @Override
    public void fly() {
        System.out.println("날 수 있는 개");
    }
}

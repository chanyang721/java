package com.inflearn.lecture.basic.abstract_;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        getSound(dog);
    }

    private static void getSound(AbstractAnimal animal) {
        animal.sound();
    }
}

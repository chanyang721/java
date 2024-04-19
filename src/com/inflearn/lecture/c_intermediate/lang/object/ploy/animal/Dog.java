package com.inflearn.lecture.c_intermediate.lang.object.ploy.animal;

public class Dog implements Animal {

    public Dog() {}

    @Override
    public void sound() {
        System.out.println("월");
    }
}

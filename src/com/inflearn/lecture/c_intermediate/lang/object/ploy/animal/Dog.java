package com.inflearn.lecture.c_intermediate.lang.object.ploy.animal;

public class Dog implements Animal {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return STR."Dog: name= \{name}, age= \{age}";
    }

    @Override
    public void sound() {
        System.out.println("월");
    }
}

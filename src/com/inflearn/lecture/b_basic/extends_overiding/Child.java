package com.inflearn.lecture.b_basic.extends_overiding;

public class Child extends Parent {
    private final String hairColor;

    public Child(String hairColor) {
        this.hairColor = hairColor;
    }

    public String childMethod() {
        return "Child method called";
    }

    @Override
    public String overriding() {
        return "Child overriding";
    }

    @Override
    public String hairColor() {
        return this.hairColor;
    }
}

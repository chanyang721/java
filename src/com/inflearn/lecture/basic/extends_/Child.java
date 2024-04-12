package com.inflearn.lecture.basic.extends_;

public class Child extends Parent {


    public String childMethod() {
        return "Child method called";
    }

    @Override
    public String overriding() {
        return "Child overriding";
    }
}

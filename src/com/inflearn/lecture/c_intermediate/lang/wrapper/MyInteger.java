package com.inflearn.lecture.c_intermediate.lang.wrapper;

public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        return this.value > target ? 1 : -1;
    }
}

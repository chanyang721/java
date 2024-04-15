package com.inflearn.lecture.b_basic.abstract_.example;

public interface Car { // platform adaptor
    String getName();
    void startEngine();
    void stopEngine();
    void pressAccelerator();
    void pressBreak();
}

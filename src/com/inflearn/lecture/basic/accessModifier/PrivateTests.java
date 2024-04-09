package com.inflearn.lecture.basic.accessModifier;

public class PrivateTests {

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.isActive = true; // public
        accessModifier.speed = 1; // protected
        accessModifier.pause = false; // default
//        accessModifier.volume = 1; // private 오류
    }
}

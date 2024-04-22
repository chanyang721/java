package com.inflearn.lecture.c_intermediate.lang.object;

import com.inflearn.lecture.c_intermediate.lang.object.ploy.car.Bmw;
import lang.object.poly.Dog;

public class ObjectArray {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bmw bmw = new Bmw();
        Object[] objects = {dog, bmw, bmw, bmw};

        System.out.println(STR."size: \{size(objects)}");
    }


    public static long size(Object[] objs) {
        return objs.length;
    }
}

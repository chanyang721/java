package com.inflearn.lecture.c_intermediate.lang.object.ploy.toString;

import com.inflearn.lecture.c_intermediate.lang.object.ploy.car.Bmw;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Printer {

    public static void main(String[] args) {
        /*
        *
        * */
        Bmw bmw = new Bmw();
        Printer.print(bmw);
    }

    public static void print(Object obj) {
        // 오버라이딩 메서드 사용
        String string = STR."객체 정보: \{obj.toString()}";
        System.out.println(STR."string = \{string}");

        // 기존 참조값
        System.out.println(Integer.toHexString(System.identityHashCode(obj)));
    }
}

package com.inflearn.lecture.c_intermediate.lang.wrapper.problem;

public class WrapperProblem {
    public static void main(String[] args) {
        /*
            `String str` 을 `Integer` 로 변환해서 출력해라.
            `Integer` 를 `int` 로 변환해서 출력해라.
            `int` 를 `Integer` 로 변환해서 출력해라.
        * */
        String str = "100";

        //`String str` 을 `Integer` 로 변환해서 출력
        Integer i1 = Integer.valueOf(str);
        System.out.println("i1 = " + i1);

        //`Integer` 를 `int` 로 변환해서 출력해라.
        int i2 = i1; // auto unboxing
        System.out.println("i2 = " + i2);
        
        //`int` 를 `Integer` 로 변환해서 출력해라.
        Integer i3 = i2; // auto boxing
        System.out.println("i3 = " + i3);
    }
}

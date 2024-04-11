package com.inflearn.lecture.basic.memoryAndStatic;

public class Stack {
    public static void main(String[] args) {
        /*
            main start    // 선입
            method1 start
            m1 : 1
            method1 end
            method2 start
            m2 : 2
            method2 end
            main end      // 후출
        * */
        System.out.println("main start");

        method1(1);

        method2(2);

        System.out.println("main end");

        Memory memory = new Memory();
        Memory.addStaticCount();
        Memory.addStaticCount();
        Memory.addStaticCount();

    }


    static void method1 (int m1) {
        System.out.println("method1 start");
        System.out.println("m1 : " + m1);
        System.out.println("method1 end");

    }

    static void method2 (int m2) {
        System.out.println("method2 start");
        System.out.println("m2 : " + m2);
        System.out.println("method2 end");
    }
}

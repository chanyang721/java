package com.inflearn.lecture.c_intermediate.lang.immutable;

public class ImmutableObjectMain {

    public static void main(String[] args) {
        ImmutableObject newObj = withName("테스트");
        System.out.println(STR."newObj = \{newObj}");

        /* 참조값 복사 */
        ImmutableObject obj = new ImmutableObject("테스트", 10);
//        ImmutableObject obj2 = obj; // 공유 참조
        ImmutableObject obj2 = new ImmutableObject("테스트2", 20); // 새로운 객체
    }


    public static ImmutableObject withName(String name) {
        ImmutableObject newObj = new ImmutableObject(name, 10);
        return newObj;
    }
}

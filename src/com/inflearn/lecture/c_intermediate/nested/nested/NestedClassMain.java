package com.inflearn.lecture.c_intermediate.nested.nested;

public class NestedClassMain {
    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass(); // 일반적인 클래스 생성
        NestedClass.StaticNestedClass staticNestedClass = new NestedClass.StaticNestedClass(); // 중첩 클래스의 인스턴스 생성

        staticNestedClass.print(); // InnerInstanceValue = 2
        System.out.println("staticNestedClass = " + staticNestedClass.getClass());
    }
}

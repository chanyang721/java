package com.inflearn.lecture.c_intermediate.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerClass innerOuter = new InnerClass();

        /*
         * 내부 클래스
         *  - 내부 클래스는 외부 클래스의 인스턴스 요소
         *  - 외부 클래스의 인스턴스에서만 내부 클래스 생성 가능
         *      - 호출 방법: outerInstance.new Inner()
         * */
        InnerClass.Inner inner = innerOuter.new Inner(); // 내부 클래스 호출 방법
        inner.printValue();

    }

}

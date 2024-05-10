package com.inflearn.lecture.c_intermediate.nested.nested;

public class NestedClass {
    public static void main(String[] args) {
        /*
        * 중첩 클래스
        *   - 클래스 내부 클래스
        *
        * 중첩 클래스의 종류
        *   - static nested class - 정적 중첩 클래스
        *   - non-static Inner class - 내부 클래스
        *       - Inner class - 내부 클래스
        *       - local Inner class - 지역 내부 클래스
        *       - anonymous class - 익명 클래스
        *
        * 중첩(Nested), 내부(Inner) 차이
        *  : 실무는 혼용
        *   - 중첩: 다른 것이 내부에 위치, 포함되는 구조
        *   - 내부: 나의 내부에 있는 나의 구성 요소
        *
        *
        * 중첩 클래스의 사용
        *   - 논리적 그룹화: 특정 클래스가 하나의 클래스에서만 사용되는 경우
        *   - 캡슐화: private 맴버에 접근 가능
        *
        * 중첩 클래스
        *   - 외부 클래스 내에서만 생성하는 경우 중첩 클래스를 사용
        *   - 따라서, 외부 클래스 이외의 곳에서 중찹 클래스 생성이 필요하면 중첩 클래스가 아닌 따로 클래스를 생성한다.
        *
        * 내부 클래스
        *   - 개념 상 외부 클래스의 인스턴스 내부에 내부 클래스가 생성
        *   - 실제 메모리에는 내부 인스턴스에 외부 인스턴스의 참조값을 보관하여 접근
        *
        * 지역 클래스
        *   - 캡쳐
        *
        * 익명 클래스
        *   -
        * */
    }

    private static int OuterClassValue = 1;
    private int OuterInstanceValue = 2;


    /*
     * 정적 중첩 클래스
     *
     * 특징:
     *  - 외부 클래스의 인스턴스에 소속 안됨
     *
     *  장점:
     *  - 외부 클래스의 private 맴버에 접근 가능
     * */
    static class StaticNestedClass {
        private static int InnerClassValue = 1;
        private int InnerInstanceValue = 2;

        public static void main(String[] args) {
            /* 내부 클래스 맴버 접근 */
            System.out.println("InnerClassValue = " + InnerClassValue);

            /* 외부 클래스 맴버 접근*/
            System.out.println("NestedClass.OuterClassValue = " + NestedClass.OuterClassValue);
        }

        public void print() {
            /* 내부 클래스의 인스턴스 맴버 접근 */
            System.out.println("InnerInstanceValue = " + InnerInstanceValue);

            /* 외부 클래스의 인스턴스 맴버 접근 */
            // System.out.println("OuterInstanceValue = " + OuterInstanceValue); // non-static variable OuterInstanceValue cannot be referenced from a static contexts
        }
    }


    /*
     * 내부 클래스
     *
     * 특징: 외부 클래스의 인스턴스에 소속
     * */
    class NonStsticInnerClass {

        /* 로컬 내부 클래스 */
        class LocalInnerClass {

        }
    }


}

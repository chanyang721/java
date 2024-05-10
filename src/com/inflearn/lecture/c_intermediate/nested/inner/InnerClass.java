package com.inflearn.lecture.c_intermediate.nested.inner;

public class InnerClass {
    private static String innerOuterValue = "내부 클래스 정적 맴버";
    private String innerOuterInstanceValue = "내부 클래스의 인스턴스 맴버";

    public class Inner {
        private String innerInstanceValue = "내부 클래스의 인스턴스 맴버";

        public void printValue() {
            /* 내부 클래스 인스턴스 맴버 호출 */
            System.out.println("innerInstanceValue = " + innerInstanceValue);

            /* 외부 클래스 인스턴스 맴버 호출 */
            System.out.println("innerOuterInstanceValue = " + innerOuterInstanceValue);

            /* 외부 클래스 맴버 호출 */
            System.out.println("innerOuterValue = " + innerOuterValue);
        }
    }
}

package com.inflearn.lecture.basic.memoryAndStatic.example;

public class StaticMethod {
    private static String staticValue = "staticValue";
    private String instanceValue = "instanceValue";


    public static void main(String[] args) { // 정적 메서드
        StaticMethodMain();
        // instanceMethodMain(); 컴파일 에러 -> 메모리에 인스턴스가 생성되지 않아 호출이 불가능
    }

    public static String deco (String str) {
        return "*" + str + "*";
    }

    public static String staticMethod() {
        return "staticMethod";
    }

    public String InstanceMethod() { // 인스턴스 메서드
        return "InstanceMethod";
    }

    public static void StaticMethodMain () {
//        System.out.println("instance: " + instanceValue + "  " + InstanceMethod()); // 컴파일 에러
        System.out.println("static: " + staticValue + "  " + staticMethod());
    }

    public void instanceMethodMain() {
        // 인스턴스 메서드는 인스턴스 변수, 메서드 호출 가능
        System.out.println("Instance: " + instanceValue + "  " + InstanceMethod());

        // 인스턴스 메서드에서는 정적 변수, 메서드 호출 가능
        System.out.println("Static: " + staticValue + "  " + StaticMethod.staticMethod());
    }
}

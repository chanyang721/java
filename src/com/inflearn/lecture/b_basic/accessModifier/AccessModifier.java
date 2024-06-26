package com.inflearn.lecture.b_basic.accessModifier;

class DefaultAccessModifier {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier();
    }
}

public class AccessModifier {
    public boolean isActive; // public 필드: 외부 호출 허용
    protected int speed; // protected 필드: 상속한 class 호출 허용
    boolean pause; // default 필드: 같은 패키지 호출 허용 (=package-private)
    private int volume; // private 필드: 내부 호출 허용

    protected static void main(String[] args) {
        /*
        * 접근 제어자 필요성
        *   - 클래스 필드를 외부 접근 권한 설정
        *   - 필요한 정보만 노출하는 추상화
        *   - js와 차이점:
        *       - package 개념으로 default 접근 제어자가 존재
        *       - class에 public과 default만 사용 가능
        *
        * 접근 제어자 사용 위치
        *   - 필드
        *   - 메서드
        *   - 생성자
        *   - 클래스
        *       - public, default 가능
        *       - public class는 반드시 파일 이름과 같아야 한다.
        *           - default class는 같은 파일 내부에 무한정 생성 가능
        * */
    }

    public void publicMethodTest() {
        System.out.println("publicMethodTest");
    }

    protected void protectedMethodTest() {
        System.out.println("protectedMethodTest");
    }

    void defaultMethodTest() {
        System.out.println("defaultMethodTest");
    }
    private void privateMethodTest() {
        System.out.println("privateMethodTest");
    }
}

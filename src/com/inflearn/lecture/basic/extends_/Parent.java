package com.inflearn.lecture.basic.extends_;

public class Parent {
    /*
    * 다형성: 상위의 추상 클래스의 경우 인스턴스로 인해 생성되는 것은 옳바른 다형성 사용 방법이 아니다.
    *   - Animal 같은 추상적 클래스가 생성되어 사용하는 것은 이상하다.
    * */

    public String parentMethod() {
        return "부모 메서드";
    }

    public String overriding() {
        return "Parent overriding";
    }

    public String hairColor () { // 오버라이딩으로 자식 추가해도 코드 변경 안함
        return "Black";
    }
}

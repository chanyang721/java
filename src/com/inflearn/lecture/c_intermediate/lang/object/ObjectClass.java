package com.inflearn.lecture.c_intermediate.lang.object;

import com.inflearn.lecture.c_intermediate.lang.object.example.Child;
import com.inflearn.lecture.c_intermediate.lang.object.example.Parent;

public class ObjectClass extends Object {
    /*
    * 모든 클래스의 최상위 부모
    *   - 위와 같이 extends Object 생략
    *   - child.ChildMethod.toString()
    *       = Child 클래스 생성 시 해당 메모리 주소에 모든 부모 클래스 생성
    *       = 메모리 호출 순서: 메모리 주소 이동 -> Child 클래스 -> Parent 클래스 -> Object 클래스 탐색
    *
    * 최상위 부모로 설계한 이유
    *   - 자바 언어 사용 편의 상 공통 기능 제공
    *   - 개발자가 많이 사용하는 공통 기능을 최상위 부모 클래스에 정의
    *       - 공통 기능에 대한 메서드 이름 일관성을 확보
    *       -
    *   - 다형성의 기본 구현
    *       - 부모는 자식을 담을 수 있기 때문에 타입이 다른 모든 객체의 매계변수 타입으로 선언 가능
    *   - 다형성 한계 존재
    *       - 다형성은 다형적 잠조와 메서드 오버라이딩이 같이 사용됨
    *       - Object 메서드 다형적 참조 가능
    *       - Object 메서드 오버라이딩 가능
    *       - 자식 클래스 메서드는 Object에 선언 & 정의 불가능
    * Object 클래스 사용처
    *   -
    * */
    public static void main(String[] args) {
        System.out.println("Object.main");
        Child child = new Child();
        Parent parent = new Parent();

        String string = child.ChildMethod().toLowerCase(); // 최상위 Object 메서드
        System.out.println("child: " + child.ChildMethod());
        System.out.println("parent: " + parent.parentMethod());
        System.out.println(string);
    }
}

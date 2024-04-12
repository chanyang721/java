package com.inflearn.lecture.basic.extends_;

public class Extends {
    public static void main(String[] args) {
        /*
        * 상속 받은 클래스의 인스턴스 생성 시, 해당 인스턴스가 담긴 메모리 영역에 관계가 있는 모든 부모 인스턴스까지 생성된다.
        *   - 업 스케일링: 문제되지 않음
        *   - 다운 스케일링: 자식 인스턴스 생성하면 부모의 인스턴스까지 메모리 영역에서 생성되지만, 손자 인스턴스까지 생성되지 않는다.
        *       - 다운 스케일링 시, 손주의 메서드 호출 시 컴파일 에러 발생
        *       - 다운 스케일링은 인스턴스 생성 후 타입을 임시로 변경하는 것 -> 생성 시 메모리 공간에 다운 스케일링 한 클래스의 메서드를 생성하지 않는다.
        * */
        downCasting();
        upCasting();
    }

    public static void downCasting() {
        Parent parent = new Parent();
        System.out.println("parent: " + parent.parentMethod());

        Child child = (Child) parent; // 다운 캐스팅
        child.childMethod();

        // 동일 한 줄 코드
        ((Child) parent).childMethod();
    }


    public static void upCasting() {
        Child child = new Child(); // 생성 시, 상속 관계의 모든 부모 인스턴스 생성
        Parent ploy = (Parent) child; // 업 캐스팅: 인스턴스 생성 시 상위 클래스의 모든 인스턴스가 메모리 공간에 생성되기 때문에 컴파일 에러가 발생하지 않는다.
        Parent parent = child; // 업 캐스팅에서 (Parent) 생략 가능 -> 자주 사용되는 기능
        ploy.parentMethod();
    }
}

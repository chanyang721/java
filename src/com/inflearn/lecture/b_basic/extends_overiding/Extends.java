package com.inflearn.lecture.b_basic.extends_overiding;

public class Extends {
    public static void main(String[] args) {
        /*
        * 상속 받은 클래스의 인스턴스 생성 시, 해당 인스턴스가 담긴 메모리 영역에 관계가 있는 모든 부모 인스턴스까지 생성된다.
        *   - 업 스케일링: 문제되지 않음
        *   - 다운 스케일링: 자식 인스턴스 생성하면 부모의 인스턴스까지 메모리 영역에서 생성되지만, 손자 인스턴스까지 생성되지 않는다.
        *       - 다운 스케일링 시, 손주의 메서드 호출 시 컴파일 에러 발생
        *       - 다운 스케일링은 인스턴스 생성 후 타입을 임시로 변경하는 것 -> 생성 시 메모리 공간에 다운 스케일링 한 클래스의 메서드를 생성하지 않는다.
        *
        * 다형성:
        *   - 다형적 참조: 부모 타입으로 선언된 변수는 자식 인스턴스 할당이 가능
        *   - 메서드 오버라이딩: 부모의 기능을 자식이 재정의 시, 자식 메서드가 우선 적용된다.
        * */
        downCasting();
        upCasting();

        Parent parent = new Parent();
        Parent parent1 = new Child("Red");
        InstanceOf(parent);
        InstanceOf(parent1);

        overriding();
        poly();
    }

    public static void downCasting() {
        Parent parent = new Child("Red"); // 부모에 자식 생성 가능 -> 부모 인스턴스도 같이 생성
        System.out.println("parent: " + parent.parentMethod()); // 타입이 부모라서 자식 메서드 사용 불가능

        Child child = (Child) parent; // 부모 타입으로 자식 인스턴스 생성 후, 자식 메서드에 접근하기 위해 다운 케스팅
         child.childMethod(); // 접근 가능
         ((Child) parent).childMethod(); // 동일 한 줄 코드

         // ClassCastException 에러
        Parent parent1 = new Parent();
        // Child child1 = (Child) parent1; // 컴퍼일 어레 발생
                // -> 부모 인스턴스 생성 시, 자식 인스턴스는 생성되지 않는다.

    }

    public static void upCasting() {
        Child child = new Child("Red"); // 생성 시, 상속 관계의 모든 부모 인스턴스 생성
        Parent ploy = (Parent) child; // 업 캐스팅: 인스턴스 생성 시 상위 클래스의 모든 인스턴스가 메모리 공간에 생성되기 때문에 컴파일 에러가 발생하지 않는다.
        Parent parent = child; // 업 캐스팅에서 (Parent) 생략 가능 -> 자주 사용되는 기능
        ploy.parentMethod();
    }

    public static void InstanceOf(Parent parent) {
        if (parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }

        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 생성");
            // Child child = (Child) parent; // 코드 생략 가능
            child.childMethod();
        }
    }

    public static void overriding() {
        Child child = new Child("Red");
        System.out.println("child.overriding(): " + child.overriding());

        Parent parent = new Parent();
        System.out.println("parent.overriding(): " + parent.overriding());

        Parent ploy = new Child("Red");
        // Parent 인스턴스에서 읽지만, 자식 인스턴스가 생성되어 자식에서 오버라이딩 한 메서드가 우선 실행 순위를 갖는다.
        System.out.println("ploy.overriding(): " + ploy.overriding()); // 오버라이딩
    }

    public static void poly() { // 새로운 기능 추가 시 수정되는 코드
        Parent[] children = {new Child("Red"), new Child("Blue"), new Child("Black")};
        for (Parent child : children) {
            System.out.println("parent.hairColor(): " + getHairColor(child));
        }
    }

    private static String getHairColor (Parent parent) { // 새로운 기능 추가 시 수정되지 않  는 코드
        return parent.hairColor();
    }
}

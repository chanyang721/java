package com.inflearn.lecture.c_intermediate.lang.object.ploy;

import com.inflearn.lecture.c_intermediate.lang.object.ploy.animal.Dog;
import com.inflearn.lecture.c_intermediate.lang.object.ploy.car.Bmw;

public class ObjectPoly {

    public static void main(String[] args) {
        Bmw bmw = new Bmw(); // 메모리에 생성
        Dog dog = new Dog();

        action(bmw); // Object 는 모든 클래스의 부모이기 때문에 인스턴스라면 input 가능
        action(dog);
    }

    public static void action(Object obj) { // 매계 변수로 재할당
        /*
        * 단점: 입력되는 클래스 사용을 위해 반드시 다운 캐스팅 필요
        *   - Object 타입 매계 변수로 재할당 -> 변수 obj로 할당되는 자식 클래스 메서드 호출 불가 -> 다운 캐스팅 필요
        * */
        if (obj instanceof Bmw bmw) { // 1. 다운 캐스팅
            bmw.sound(); // 2. 메서드 호출
        }
        else if (obj instanceof Dog dog) {
            dog.sound();
        }
    }
}

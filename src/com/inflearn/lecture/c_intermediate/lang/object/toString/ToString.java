package com.inflearn.lecture.c_intermediate.lang.object.toString;

import com.inflearn.lecture.c_intermediate.lang.object.ploy.animal.Dog;
import com.inflearn.lecture.c_intermediate.lang.object.ploy.car.Bmw;

public class ToString {
    public static void main(String[] args) {
        System.out.println("ToString.main");
        /*
        * lang 라이브러리의 ToString 메서드 제공 정보는 참조값만 제공해줌
        *   - toString은 보통 오버라이딩하여 원하는 정보를 리턴하게 변경함
        *
        * */
        Object obj = new Object();
        System.out.println(STR."obj = \{obj}"); // println 내부 로직에서 ToString 호출하기 때문에 Object를 매계변수로 넣어도ㄴ 가능
        
        String string = obj.toString();
        System.out.println(STR."string = \{string}");

        /*
        * toString Override
        * */
        Bmw bmw = new Bmw();
        Dog dog = new Dog("바둑이", 2);
        System.out.println(STR."dog.toString(); = \{dog.toString()}");
    }
}

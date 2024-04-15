package com.inflearn.lecture.b_basic.varType;

public class VarType {
    /*
    * 변수의 대전제: 자바는 항상 변수의 값을 복사해서 대입한다.
    * 1. 변수의 형
    *   - 기본형: 메모리에 직접 데이터 할달
    *   - 참조형: 메모리에 참조형 데이터의 주소 할당
    * */

    public static void main(String[] args) {
        String str = "기본";
        Ref strRef = new Ref();
        strRef.name = "참조";

        System.out.println("전 :" + str);
        Assignment(str);
        System.out.println("후 :" + str);
        System.out.println("전 :" + strRef.name);
        AssignmentRef(strRef);
        System.out.println("후 :" + strRef.name);
    }

    static void Assignment (String z) {
        z = "기본 변경";
    };

    static void AssignmentRef(Ref ref) {
        ref.name = "변경 됨";
    }
}
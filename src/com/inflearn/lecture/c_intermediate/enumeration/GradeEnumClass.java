package com.inflearn.lecture.c_intermediate.enumeration;

public class GradeEnumClass {
    /*
    * 타입 안전 열거형 패턴
    * */
    private static final GradeEnumClass GOLD = new GradeEnumClass();
    private static final GradeEnumClass SLIVER = new GradeEnumClass();
    private static final GradeEnumClass DIAMOND = new GradeEnumClass();
    private static final GradeEnumClass MASTER = new GradeEnumClass();

    /*
    * 새로운 필드 추가를 제한하기 위한 생성자 접근 제한
    * */
    private GradeEnumClass() {};
}

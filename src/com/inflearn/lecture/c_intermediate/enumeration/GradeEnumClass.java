package com.inflearn.lecture.c_intermediate.enumeration;

public class GradeEnumClass {
    /*
    * 타입 안전 열거형 패턴
    * */
    private static final GradeEnumClass GOLD = new GradeEnumClass(10);
    private static final GradeEnumClass SLIVER = new GradeEnumClass(20);
    private static final GradeEnumClass DIAMOND = new GradeEnumClass(30);
    private static final GradeEnumClass MASTER = new GradeEnumClass(40);

    private final int discountPercent;

    /*
    * 새로운 필드 추가를 제한하기 위한 생성자 접근 제한
    * */
    private GradeEnumClass(int discountPercent) {
        this.discountPercent = discountPercent;
    };

    public int getDiscountPercent() {
        return discountPercent;
    }
}

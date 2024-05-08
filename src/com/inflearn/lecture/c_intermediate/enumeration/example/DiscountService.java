package com.inflearn.lecture.c_intermediate.enumeration.example;
import com.inflearn.lecture.c_intermediate.enumeration.Grade;

public class DiscountService {
    public static int discount(Grade grade, int price) {
        // return price * grade.getDiscountPercent() / 100; // 코드 변경 없지만, 캡슐화 안됨
        return grade.discount(price); // 코드 변경 없고, 캡술화 상태
    }
}

package com.inflearn.lecture.c_intermediate.enumeration.example;

import com.inflearn.lecture.c_intermediate.enumeration.Grade;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100; // 고정
    }
}

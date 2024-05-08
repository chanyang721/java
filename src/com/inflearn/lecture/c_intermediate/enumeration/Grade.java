package com.inflearn.lecture.c_intermediate.enumeration;

public enum Grade {
    ICON(0),
    SLIVER(10),
    GOLD(20),
    DIAMOND(30),
    MASTER(40);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public int discount(int price) {
        return price * discountPercent / 100; // 코드 변경 없음
    }
}

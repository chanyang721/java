package com.inflearn.lecture.c_intermediate.enumeration;

public enum Grade {
    GOLD(10),
    SLIVER(20),
    DIAMOND(30),
    MASTER(40);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}

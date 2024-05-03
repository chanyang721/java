package com.inflearn.lecture.c_intermediate.enumeration.example;

import com.inflearn.lecture.c_intermediate.enumeration.Grade;

public class DiscountServiceMain {

    public static void main(String[] args) {
        int price = 10_000;
        DiscountService discountService = new DiscountService();

        /* 할인율 적용 */
        int gold = discountService.discount(Grade.GOLD, price);
        System.out.println("gold = " + gold);
        
        int sliver = discountService.discount(Grade.SLIVER, price);
        System.out.println("sliver = " + sliver);
        
        int diamond = discountService.discount(Grade.DIAMOND, price);
        System.out.println("diamond = " + diamond);
        
        int master = discountService.discount(Grade.MASTER, price);
        System.out.println("master = " + master);
        
    }
}

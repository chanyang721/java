package com.inflearn.lecture.c_intermediate.enumeration.example;

import com.inflearn.lecture.c_intermediate.enumeration.Grade;

public class DiscountServiceMain {

    public static void main(String[] args) {
        int price = 10_000;
        DiscountService discountService = new DiscountService();

        /* 할인율 적용 */
        int gold = discountService.discount(Grade.GOLD, price);
        int gold1 = Grade.GOLD.discount(price); // Grade class 캡슐화로 DiscountService 필요 없음
        System.out.println("gold = " + gold);
        
        int sliver = discountService.discount(Grade.SLIVER, price);
        int sliver1 = Grade.SLIVER.discount(price);
        System.out.println("sliver = " + sliver);
        
        int diamond = discountService.discount(Grade.DIAMOND, price);
        int diamond1 = Grade.DIAMOND.discount(price);
        System.out.println("diamond = " + diamond);
        
        int master = discountService.discount(Grade.MASTER, price);
        int master1 = Grade.MASTER.discount(price);
        System.out.println("master = " + master);

        /* 등급 추가 시 main의 코드 변경 없음 */
        Grade[] grades = Grade.values();
        for (Grade grade : grades ) {
            System.out.println(STR."grade = \{grade.name()}: price: \{grade.discount(price)}");
        }
    }
}

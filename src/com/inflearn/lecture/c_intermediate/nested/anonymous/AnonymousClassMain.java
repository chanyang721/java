package com.inflearn.lecture.c_intermediate.nested.anonymous;

import java.util.Random;

public class AnonymousClassMain {

    public static void Printer(Process process) {
        System.out.println("시작");
        process.run();
        System.out.println("종료");
    }

    public static class Dice implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("Dice = " + randomValue);
        }
    }
    
    public static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 0; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {

        /*
         * 익명 클래스의 선언 & 생성
         *   - AnonymousClass 라는 인터페이스로 생성하는 익명 클래스
         *   -
         * */
        Process dice = new Dice();
        Process sum = new Sum();

        Printer(dice);
        Printer(sum);

        /* 익명 클래스 사용 */
        Printer(new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("Dice = " + randomValue);
            }
        });

        Printer(new Process() {
            @Override
            public void run() {
                for (int i = 0; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });

        /* 람다 사용 */
        Printer(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("Dice = " + randomValue);
        });
        Printer(() -> {
            for (int i = 0; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}

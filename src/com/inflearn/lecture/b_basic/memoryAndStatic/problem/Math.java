package com.inflearn.lecture.b_basic.memoryAndStatic.problem;

public class Math {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        System.out.println("합계: " + MathArrayUtils.sum(arr));
        System.out.println("평균: " + MathArrayUtils.average(arr));
        System.out.println("최소: " + MathArrayUtils.min(arr));
        System.out.println("최대: " + MathArrayUtils.max(arr));
    }
}

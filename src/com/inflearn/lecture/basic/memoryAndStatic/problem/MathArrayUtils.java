package com.inflearn.lecture.basic.memoryAndStatic.problem;

public class MathArrayUtils {
    private MathArrayUtils() {} // 인스턴스 생성 제한

    public static int sum(int[] array) {
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }

        return result;
    }

    public static int average(int[] array) {
        int sum = sum(array);
        return sum / array.length;
    }

    public static int min(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    public static int max(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) max = array[i];
        }

        return max;
    }
}

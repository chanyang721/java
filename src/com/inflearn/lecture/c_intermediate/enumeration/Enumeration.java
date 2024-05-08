package com.inflearn.lecture.c_intermediate.enumeration;

public class Enumeration {
    public static void main(String[] args) {
        System.out.println(STR."1 :\{Grade.GOLD.getClass()}");
        System.out.println(STR."2 :\{Grade.SLIVER.getClass()}");
        System.out.println(STR."3 :\{Grade.DIAMOND.getClass()}");

        System.out.println(STR."1 ref: \{refValue(Grade.GOLD)}");
        System.out.println(STR."2 ref: \{refValue(Grade.SLIVER)}");
        System.out.println(STR."3 ref: \{refValue(Grade.DIAMOND)}");
    }

    public static String refValue(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}

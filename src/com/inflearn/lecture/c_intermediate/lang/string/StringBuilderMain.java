package com.inflearn.lecture.c_intermediate.lang.string;

public class StringBuilderMain {

    public static void main(String[] args) {
        /*
        * - 불변 객체인 String의 단점을 보완
        *       - 불변 객체는 수정 시 새로운 객체 생성하여 사용하지 않는 메모리 사용량이 증가 -> GC하는 일이 자주 발생
        *
        * */
        stringBuilder();
    }

    public static void stringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("A");
        sb.append("A");
        sb.append("A");
        sb.append("A");
        sb.append("B");
        System.out.println("sb = " + sb);


        sb.insert(3, "TEST");
        System.out.println("sb = " + sb);
        
        sb.delete(3, 7);
        System.out.println("sb = " + sb);

        sb.reverse();
        System.out.println("sb = " + sb);

        /* builder => string */
        String str = sb.toString();
        System.out.println("str = " + str);
        System.out.println("sb = " + sb);
    }
}

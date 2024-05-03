package com.inflearn.lecture.c_intermediate.lang.system;

import java.util.Map;

public class system {
    public static void main(String[] args) {
        /*
        * 시스템 클래스란?
        *   - 시스템과 관련된 기본 기능 제공
        * */

        /* 시간 */
        long currentTimeMillis = System.currentTimeMillis(); // 현제 시간 밀리초 조회
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long nanoTime = System.nanoTime();// 현제 시간 나노초 조회
        System.out.println("nanoTime = " + nanoTime);

        Map<String, String> getenv = System.getenv();// 시스템 환경 변수 조회
        System.out.println("getenv = " + getenv);

        System.exit(0); // 프로그램 시스템 종료
    }
}

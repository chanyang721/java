package com.inflearn.lecture.basic.memoryAndStatic;

public class Memory {
    static int count = 0;


    public static void main(String[] args) {
        /*
        * 메모리
        *   - Method Area:
        *       - 클래스 정보: 클래스의 모든 정보를 보관
        *       - static area: 메서드에 선언된 변수 보관
        *       - 런타임 상수: ?
        *   - Stack Area: 생행된 메서드, 지역 변수, 매계 변수 등 보관
        *       - thread: thread 당 하나의 Stack Area가 생성
        *   - Heap Area: 인스턴스, 배열 보관
        *       - GC의 주요 영역
        *
        * 1. 인스턴스 생성 시
        *   - 필드: 힙 영역 메모리 할당 (서로 다름)
        *   - 메서드: 메모리 영역 공통 관리 & 실행 (서로 같음)
        *
        * 2. 메서드 실행 시
        *   - Stack Area에 순서대로 Stack Frame(메서드 실행) 생성
        *   - Stack Frame 종료 시, Stack Area에서 제거
        *   - Stack Area에 Stack Frame이 없다면 프로그램 종료
        */


        /* 2. Stack & Queue
        *   - Stack: LIFO (후입선출)
        *       - 위만 열려 있는 통
        *   - Queue: FIFO (선입선출)
        *       - 위, 아래가 열려 있는 통
        *   - Why "Stack" Area, not Queue ?
        *       - 프로그램 실행 시, Stack 구조가 유리하다?
        * */
    }

    static void addStaticCount() {
        System.out.println("메모리 Count, 메모리 영역 동시 관리 테스트 :" + Memory.count++);
        System.out.println("메모리 Count, 메모리 영역 동시 관리 테스트 :" + Memory.count++);
        System.out.println("메모리 Count, 메모리 영역 동시 관리 테스트 :" + Memory.count++);
    }
}

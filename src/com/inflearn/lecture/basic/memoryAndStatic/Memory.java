package com.inflearn.lecture.basic.memoryAndStatic;

import com.inflearn.lecture.basic.memoryAndStatic.example.Deco;
import com.inflearn.lecture.basic.memoryAndStatic.example.StaticMethod;

public class Memory {

    private int instanceCount;
    private static int staticCount;


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

        /*
        * Static 정리
        *   - 맴버 변수 (필드)
        *       - 인스턴스 변수
        *       - class static 변수
        *   - 매계 변수
        *       - 메서드 실행에 필요한 변수
        *
        *   - 메서드
        *       - 메모리의 Method Area에 보관되어 인스턴스에서 호출 시 힙 영역에 생성된다.
        *       - 클래스에서 인스턴스 변수가 없는 경우에 인스턴스 생성하면 메모리만 차지하고 메서드는 결국 Method영역을 참조하게 된다.
        *       - 따라서, 스테틱 메서드를 만들어 클래스에서 호출하는 방식으로 필요없는 인스턴스를 만들지 않는다.
        *  제한된 Static 메서드 사용방법
        *   - 스테틱 메서드는 스테틱 변수와 메서드만 사용 가능하다.
        *   - 인스턴스는 인스턴스 변수, 메서드, 스테틱 변수, 메서드 전부 사용 가능하다.
        * */
    }

    static void addStaticCount() {
        Memory memory = new Memory();
        System.out.println("메모리 Count, 메모리 영역 동시 관리 테스트 :" + ++Memory.staticCount);
        System.out.println("메모리 Count, 메모리 영역 동시 관리 테스트 :" + ++Memory.staticCount);
        System.out.println("메모리 Count, 메모리 영역 동시 관리 테스트 :" + ++Memory.staticCount);
        System.out.println("Heap Area, Count :" + memory.instanceCount); // 인스턴스에서 힙 영역 instance 변수 접근
        System.out.println("Heap Area, Count :" + memory.staticCount); // 인스턴스에서 메모리 영역의 static 클래스 변수 접근:
            /*
            * 인스턴스에서 static 변수에 접근하는 방법은 권장하지 않음
            *   - 읽는 사람이 인스턴스 변수인지, 스테틱 변수인지 구분되지 않음
            * */

        System.out.println("Method Area, Count: " + Memory.staticCount); // 메모리 영역에서 static 클래스 변수 접근
        System.out.println("Static Method: " + StaticMethod.deco("Hello!"));
    }
}

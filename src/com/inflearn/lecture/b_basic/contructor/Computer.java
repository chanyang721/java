package com.inflearn.lecture.b_basic.contructor;

public class Computer {
    String cpu;
    String ObjectCpu;
    String board;
    String ram;
    String gpu;
    String cooler;
    String Power;

    /*
    * 생성자는 class 이름과 같은 메서드이다.
    * 생성자는 반환 타입이 없다.
    * 생성자 오버로딩으로 여러개의 생성자 생성 가능
    * */
    Computer(String cpu, String board, String ram) {
        this.cpu = cpu;
        this.board = board;
        this.ram = ram;
        System.out.println("생성자 1 호출");
    }

    Computer(String cpu, String board, String ram, String gpu) {
        this("삼성", board, ram); // this 함수: 생성자 함수 첫줄에만 사용 가능
        this.gpu = gpu;
        System.out.println("생성자 2 호출");
    }


    void initComputer (String cpu, String board, String ram) {
        /*
        * this: 인스턴스 생성 시 객체 자신
        *  - 스코프 상 필드와 매계 변수의 이름이 같은 경우 구분하여 사용 가능
        *  - 변수명이 다르다면 this를 사용하지 않고 접근 가능
        * */
        this.cpu = cpu;
        ObjectCpu = cpu; // 맴버 변수인 경우 변수명이 다르더라도 this를 붙여서 가독성을 높이는 코드 스타일이 있었다. -> 현재는 IDE가 구분해줌

        this.board = board;
        this.ram = ram;
    }
}

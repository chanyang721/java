package com.inflearn.lecture.b_basic.contructor;

public class Constructor {
    public static void main(String[] args) {
        /*
        * 필요한 이유
        *   - 객체 지향에서 객체의 필드의 초기값을 생성 시 정의하기 위해 생성자를 사용
        *   - 객체 생성 시 초기값을 넣는 경우가 많아 편의적인 기능
        *   - 기존적으로 매계 변수가 없는 생성자가 생성되고 생략 가능
        *   -
        * */
        Computer[] computers = {
            new Computer("INTEL", "MSI", "삼성"),
            new Computer("AMD", "기가바이트", "SK"),
            new Computer("AMD", "기가바이트", "SK", "생성자 오버로딩")
        };
        for (Computer c : computers) {
            System.out.println("컴퓨터 정보 :" + c.cpu);
        }
    }
}

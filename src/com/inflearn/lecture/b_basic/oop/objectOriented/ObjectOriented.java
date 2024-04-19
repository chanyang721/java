package com.inflearn.lecture.b_basic.oop.objectOriented;

public class ObjectOriented {
    public static void main(String[] args) {
        /*
         * 객체 지향 프로그래밍
         *  - 데이터와 기능을 같이 정의하여 관리
         * 장점:
         *  - 관련 데이터와 기능을 응집력 있게 관리 가능
         *  - 프로그램에서 사용되는 개념 정의에 집중하여 구현
         *
         * 특징:
         *  - 캡슐화: 객체의 역할을 class에 정의하여 내부 작동을 모아서 관리
         *  - 다형성:
         * */
        MusicPlayer player = new MusicPlayer();
        player.on();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.showStatus();
        player.off();
    }
}

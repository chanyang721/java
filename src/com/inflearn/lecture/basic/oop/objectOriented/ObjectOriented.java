package com.inflearn.lecture.basic.oop.objectOriented;

public class ObjectOriented {
    public static void main(String[] args) {
        /*
         * 객체 지향 프로그래밍
         *  - 데이터와 기능을 같이 정의하여 관리
         * 장점:
         *  - 관련 데이터와 기능을 응집력 있게 관리 가능
         *  - 프로그램의 실행 순서보다 프로그램에서 사용되는 개념의 정의에 집중하여 구현
         *  - 캡슐화: 객체의 역할을 class에 정의하여 내부 작동을 몰라도 사용 할 수 있다.
         *  -
         * 단점:
         *  -
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

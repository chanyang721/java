package com.inflearn.lecture.b_basic.oop.objectOriented;

public class MusicPlayer {
    static boolean isActive;
    static int volume;


    void on() {
        isActive = true;
        System.out.println("뮤직 플레이어를 시작합니다.");
    }
    void off() {
        isActive = false;
        System.out.println("뮤직 플레이어를 종료합니다.");
    }

    void volumeDown() {
        volume--;
    }

    void volumeUp() {
        volume++;
    }

    /* 상태 확인 */
    void showStatus() {
        if (isActive) {
            System.out.println("실행 상태 확인 : " + isActive);
            System.out.println("volume : " + volume);
        } else {
            System.out.println("플레이어 실행 상태 확인 : " + isActive);
        }
    }
}

package Lecture.Basic.OOP.ObjectOriented;

import java.util.Objects;

public class ObjectOriented {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 플레이어 실행
        setMusicPlayerActive(player, "on");
        System.out.println("isActive : " + player.isActive);

        // 볼륨 증가
        setVolume(player, "+");
        System.out.println("player.volume : " + player.volume);

        // 볼륨 증가
        setVolume(player, "+");
        System.out.println("player.volume : " + player.volume);

        // 볼륨 감소
        setVolume(player, "-");
        System.out.println("player.volume : " + player.volume);

        // 상태 확인
        showStatus(player);

        // 플레이어 끄기
        setMusicPlayerActive(player, "off");
        System.out.println("player.isActive : " + player.isActive);
    }

    static void setMusicPlayerActive(MusicPlayer player, String status) {
        if(status.equals("on")) player.isActive = true;
        else if(status.equals("off")) player.isActive = false;
    }

    static void setVolume(MusicPlayer player, String status) {
        if(status.equals("+")) player.volume++;
        else if (status.equals("-")) player.volume--;
    }

    static void showStatus(MusicPlayer player) {
        if (player.isActive) {
            System.out.println("실행 상태 확인 : " + player.isActive);
            System.out.println("player.volume : " + player.volume);
        } else {
            System.out.println("플레이어 실행 상태 확인 : " + player.isActive);
        }
    }
}

package Lecture.Basic.OOP.ObjectOriented;

public class MusicPlayer {
    static boolean isActive;
    static int volume;

    void setMusicPlayerActive(String status) {
        if(status.equals("on")) isActive = true;
        else if(status.equals("off")) isActive = false;
    }

    void setVolume(String status) {
        if(status.equals("+")) volume++;
        else if (status.equals("-")) volume--;
    }

    void showStatus() {
        if (isActive) {
            System.out.println("실행 상태 확인 : " + isActive);
            System.out.println("volume : " + volume);
        } else {
            System.out.println("플레이어 실행 상태 확인 : " + isActive);
        }
    }

}

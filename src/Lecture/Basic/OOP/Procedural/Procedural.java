package Lecture.Basic.OOP.Procedural;

public class Procedural {

    public static void main(String[] args) {
        /*
        * 절차 지향 프로그래밍
        * - 프로그램 실행 순서 흐름을 순차적으로 처리하는 방식
        * - "어떻게" 를 중심으로 프로그래밍 한다.
        *
        * 절차 지향 프로그래밍의 한계
        *   - 데이터와 기능이 분리되어 있다.
        *       - MusicPlayer 데이터와 데이터를 사용한 기능 setMusicPlayer, setVolume, 등을 분리하여 관리
        * */
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

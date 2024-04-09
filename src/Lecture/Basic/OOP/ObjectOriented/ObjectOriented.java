package Lecture.Basic.OOP.ObjectOriented;

public class ObjectOriented {
    public static void main(String[] args) {
        /*
         * 객체 지향 프로그래밍
         *  - 데이터와 기능을 같이 정의하여 관리
         * 장점:
         *  - 관련 데이터와 기능을 응집력 있게 관리 가능
         * 단점:
         *  -
         * */
        MusicPlayer player = new MusicPlayer();
        player.setMusicPlayerActive("on");
        player.setVolume("+");
        player.setVolume("+");
        player.setVolume("-");
        player.showStatus();
        player.setMusicPlayerActive("off");
    }
}

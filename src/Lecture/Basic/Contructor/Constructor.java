package Lecture.Basic.Contructor;

public class Constructor {
    public static void main(String[] args) {
        /*
        * 필요한 이유
        *   - 객체 지향에서 객체의 필드의 초기값을 생성 시 정의하기 위해 생성자를 사용
        *   -
        * */
        Computer computer1 = new Computer("INTEL", "MSI", "삼성");
        Computer computer2 = new Computer("AMD", "기가바이트", "SK");
        System.out.println(computer1.cpu);
        System.out.println(computer2.cpu);
    }
}

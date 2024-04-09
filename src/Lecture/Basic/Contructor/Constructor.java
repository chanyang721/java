package Lecture.Basic.Contructor;

public class Constructor {
    public static void main(String[] args) {
        /*
        * 필요한 이유
        *   - 객체 지향에서 객체의 필드의 초기값을 생성 시 정의하기 위해 생성자를 사용
        *   -
        * */
        Computer[] computers = {
            new Computer("INTEL", "MSI", "삼성"),
            new Computer("AMD", "기가바이트", "SK")
        };
        for (Computer c : computers) {
            System.out.println("컴퓨터 정보 :" + c.cpu);
        }
    }
}

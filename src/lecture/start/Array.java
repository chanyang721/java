package lecture.start;

public class Array {
    public static void main(String[] args) {
        /*
        * 배열 생성 시 디폴트
        * 숫자: 0
        * 불린: false
        * 문자: null
        * */
        int[] students = new int[5];
        System.out.println(students); // [I@2a84aee7: [I (배열 인트) + @ + 16진수(참조값)
        boolean[] type = new boolean[5];
        System.out.println(type); // [Z@a09ee92: [Z (배열 불린) + @ + 16진수(참조값)

        String[] StrArray = new String[5];
        System.out.println(StrArray); // [Ljava.lang.String;@30f39991

        /*
        * 배열 초기화 {}
        * */
        int[] gg = new int[]{1, 2}; // 동적 메모리 크기 할당 가능
        int[] hh = {1, 2}; // 축약 표현, new int[] 생략 가능
        System.out.println(gg);
        System.out.println(hh);

        /*
        * 2차원 배열 선언
        * */
        int row = 2;
        int col = 3;
        int[][] ggg = new int[row][col];
        int[][] hhh = {
            {1, 2 ,3},
            {4, 5, 6}
        };


        // 일반 for 문
        for (int i = 0; i < ggg.length; ++i) {

        }

        // for 문 축약
        int[] numbers = {1, 2 ,3, 4};
        for (int number : numbers) {
            System.out.println("number" + " " + number);
        }

        int ee = 1;
        int ll = 3;
        int rr = add(ee, ll);
        System.out.println(rr);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

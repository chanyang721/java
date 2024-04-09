package Basic.language;

public class Variable {


    public static void main(String[] args) {
        System.out.println("Hello Variable");

        int a; //  변수 선언: 메모리 공간 확보
        a = 10; // 변수 초기화: 메모리 공간에 데이터 할당
        System.out.println(a);
        a = 50; // 변수 할당: 메모리 공간에 데이터 변경
        System.out.println(a);

        int b = 0, c = 0; // 변수 다중 선언 및 초기화
        int d;
        System.out.println(b);
        System.out.println(c);
//        System.out.println(d); // 해당 메모리 공간에 데이터가 없는데 읽는 경우 컴파일 에러
        // 컴파일 에러 > java: variable d might not have been initialized

        /*
        * 변수 타입 & 리터럴
        * */
        int q = 0; // 정수
        double w = 10.5; // 실수
        char e = 'a'; // 문자 하나는 '' 사용
        String r = "Hello"; // 문자열은 "" 사용


        /*
         * 형 변환
         * 같은 타입의 리터럴 간
         * 작은 -> 큰:
         *  - 에러 없음
         *  - 자동 형변환
         * 큰 -> 작은:
         *  - 소수점 버림 현상
         *  - 오버플로우 현상
         *  - 명시적 형변환 사용
         * - 서로 다른 리터럴간 계산의 결과는 큰 타입으로 반환
         * */
        int aa = 1;
        double bb = 1.5;
        aa = (int) bb;
        System.out.println(aa);

        // 오버플로우
        long over = 2147483648L; // int 최대값 + 1
        int testInt = 0;
        testInt = (int) over;
        System.out.println(testInt); // -2147483648 -> 오버플로우로 최소값 리턴
    }

    public static void VarType(String[] args) {
        /*
        * 리터럴에 맞게 메모리 공간을 차지한다
        * 현 시대에 메모리 용량은 싸다. 개발 속도를 빠르게 하는 것이 더 효율적이다.
        * > 자주 사용하는 Java 리터럴 정리
        * 1. 숫자: 정수 (int, long), 실수 (double)
        * 2. 문자: String
        * 3. 불린: boolean
        * */
        // 정수
        byte e = 127; // -128 ~ 127 -> int로 사용, 거의 사용하지 않는다
        short t = 32767; // -32768 ~ 32767 -> int로 사용, 표현의 길이가 작아 사용하지 않는다.
        int a = 2147483647; // -2147483648 ~ 2147483647 (20억)
        long i = 9223372036854775807L; // 존나김

        // 실수
        double b = 10.5;
        float c = 10.0f; // double 사용, 표현할 수 있는 길이와 정밀도가 낮다.

        // 문자
        char g = 'd'; // String 사용
        String r = "";

        // 불린
        boolean k = true;

        int grade = 2;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            default -> 500;
        };

        int age = 34;
        String d = (age > 20) ? "미성년자" : "성인";
    }
}

package com.inflearn.lecture.c_intermediate.exception.checked;

public class Service {
    private final Client client = new Client();

    public static void main(String[] args) {
        /*
         * 예외 처리 방법
         *   - 1. 잡아서 처리
         *   - 2. 던짐
         * */
    }


    /*
     * 1. 잡아서 처리
     * */
    public void catchException () {
        try {
            System.out.println("정상 흐름");
            client.call(); // 예외를 던지는 메서드
        } catch (CheckedException e) {
            /*
            * 최상위 Exception 객체로 하위 모든 예외 객체를 잡는다.
            *   - 만약 특정 예외만 잡고 싶다면, 예외 객체를 만들어 매계변수 타입으로 넣는다.
            * */
            System.out.println("예외 흐름");
        }
    }

    /*
    * 2. 체크 예외를 밖으로 던짐
    * */
    public void throwException() throws CheckedException {
        client.call();
    }

    /*
    * 3. 언체크 예외는 자동으로 던져짐
    * */
    public void throwUnCheckedException() { // throws 생략
        client.callUnCheckedException(); // 언체크 예외는 자동으로 상위로 던진다.
    }

    public void throwUnCheckedException_A() throws RuntimeException { // throws 명시로 개발자 간 가독성에 도움은 줄 수 있다.
        client.callUnCheckedException(); // 언체크 예외는 자동으로 상위로 던진다.
    }

    /*
    * 필요하다면 언체크 예외를 try ~ catch 로 잡아서 사용
    * */
    public void catchUnCheckedException() {
        try {
            client.callUnCheckedException();
        } catch (RuntimeException e) {
            throw new UnCheckedException("언체크 Catch");
        }
    }
}

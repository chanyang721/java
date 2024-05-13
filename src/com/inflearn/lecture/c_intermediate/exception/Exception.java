package com.inflearn.lecture.c_intermediate.exception;

public class Exception {
    public static void main(String[] args) {
        /*
         * 정상 흐름과 예외 흐름의 분리
         *   - 가독성을 위해 분리
         *   - 키워드: try, catch, finally, throw, throws
         *   - 종류: 체크 예외, 언체크 예외, 런타임 예외
         *
         * 특징
         *   - 상위 예외를 catch로 잡으면 하위 예외까지 잡힌다.
         *   - Exception 객체는 실질적 애플리케이션의 최상위 예외로 체크 예외이지만 언체크 예외를 포함하셔 처리 한다. ?
         *
         * 규칙
         *   - 처리가 가능한 예외는 잡는다.
         *   - 처리가 불가능한 예외는 던진다.
         *   - 둘 중 하나를 하지 않는다면 컴파일 오류 발생
         *
         * 키워드 사용
         *  - throws: 발생한 예외를 메서드 밖으로 던질때 사용
         *  - throw: 예외 발생하는데 사용
         *  - try ~ catch: 정상 흐름에서 체크 예외를 잡는데 사용
         *
         * 장단점
         *  - 체크 예외 처리
         *      - 장: 예상하지 못한 하위 예외 처리로 안전 장치 역할을 해줌
         *      - 단: 불필요한 모든 예외 처리를 해줘야해서 번거로움
         *  - 언체크 예외 처리
         *      - 장: throws 생략 가능
         *      - 단: 예외 누락 가능성 존재
         *
         * 차이점
         *  - throws 선언 생략 가능 여부
         *  - 언체크 예외는 무조건 예외를 밖으로 던진다.
         *
         * Throwable (최상위 예외 객체)
         *   - Exception (체크 예외): 애플리케이션 최상위 예외 객체
         *       - SQLException ():
         *       - IOException ():
         *       - RuntimeException (언체크[런타임] 예외): 컴파일러가 체크하지 않는 예외
         *           - NullPointerException
         *           - illegalArgument Exception
         *   - Error (심각한 시스템 오류)
         *       - OutOfMemoryException
         *
         *   방법 1: 예외 계층
         *
         * 나와 다르게 구현한 것
         *   - 클래스 이름
         *       - Network -> NetworkClient
         *       - NetworkMain -> NetworkService
         *
         *   - error 발생 데이터 동적으로 할당
         * */
    }
}

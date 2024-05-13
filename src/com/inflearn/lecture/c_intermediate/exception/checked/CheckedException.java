package com.inflearn.lecture.c_intermediate.exception.checked;

public class CheckedException extends Exception {
    /*
    *   체크 예외
    *       - Exception 상속 시 체크 예외 객체
    * */

    public CheckedException(String message) {
        super(message);
    }
}

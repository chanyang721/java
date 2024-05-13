package com.inflearn.lecture.c_intermediate.exception.checked;

public class UnCheckedException extends RuntimeException { // 언체크 예외 객체

    public UnCheckedException(String message) {
        super(message);
    }
}

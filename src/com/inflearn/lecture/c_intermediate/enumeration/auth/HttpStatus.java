package com.inflearn.lecture.c_intermediate.enumeration.auth;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(404, "BAD_REQUEST"),
    NOT_FOUND(400, "NOT_FOUND"),
    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

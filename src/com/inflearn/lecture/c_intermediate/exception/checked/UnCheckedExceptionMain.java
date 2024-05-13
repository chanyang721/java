package com.inflearn.lecture.c_intermediate.exception.checked;

public class UnCheckedExceptionMain {

    public static void main(String[] args) {
        Service service = new Service();

        service.catchUnCheckedException();

        // service.throwUnCheckedException(); // 던진 후 바로 종료

        System.out.println("정상 종료"); // 안읽음
    }
}

package com.inflearn.lecture.c_intermediate.exception.checked;

public class CheckedExceptionMain {
    public static void main(String[] args) throws CheckedException {
        Service service = new Service();

        service.catchException(); // 잡아서 처리

        service.throwException(); // 던짐

        System.out.println("정상 종료");
    }
}

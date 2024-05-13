package com.inflearn.lecture.c_intermediate.exception.checked;

import com.inflearn.lecture.c_intermediate.exception.Exception;

public class Client {


    /*
    * 기본 예외 발생 방법
    * */
    public void call() throws CheckedException {
        throw new CheckedException("checked exception"); // 예외 객체 생성 후 throw
    }

    public void callUnCheckedException() { // throws 생략 가능
        throw new UnCheckedException("unChecked exception");
    }
}

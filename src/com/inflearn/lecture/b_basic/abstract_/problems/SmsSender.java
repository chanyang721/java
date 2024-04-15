package com.inflearn.lecture.b_basic.abstract_.problems;

public class SmsSender implements Sender {


    @Override
    public void sendMessage() {
        System.out.println("SMS 메시지 전송");
    }
}

package com.inflearn.lecture.basic.abstract_.problems;

public class FacebookSender implements Sender {
    @Override
    public void sendMessage() {
        System.out.println("페이스북 메시지 전송");
    }
}

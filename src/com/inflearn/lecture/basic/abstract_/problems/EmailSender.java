package com.inflearn.lecture.basic.abstract_.problems;

public class EmailSender implements Sender {
    @Override
    public void sendMessage() {
        System.out.println("이메일 메시지 전송");
    }
}

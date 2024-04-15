package com.inflearn.lecture.basic.abstract_.problems;

public class SendMessage {

    private Sender sender; // 역할에 의존

    public void setSender(Sender sender) { // 역할의 구현부 할당
        this.sender = sender;
    }

    public void sendMessage() { // 구현부 오버라이딩 메서드 호출
        sender.sendMessage();
    }
}

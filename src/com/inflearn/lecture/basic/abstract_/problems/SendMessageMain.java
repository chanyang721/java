package com.inflearn.lecture.basic.abstract_.problems;

public class SendMessageMain {

    public static void main(String[] args) { // 실행부는 기능 확장 시 코드 변경
        SendMessage sendMessage = new SendMessage();

        EmailSender emailSender = new EmailSender();
        SmsSender smsSender = new SmsSender();
        FacebookSender facebookSender = new FacebookSender();

        sendMessage.setSender(emailSender);
        sendMessage.sendMessage();

        sendMessage.setSender(smsSender);
        sendMessage.sendMessage();

        sendMessage.setSender(facebookSender);
        sendMessage.sendMessage();
    }
}

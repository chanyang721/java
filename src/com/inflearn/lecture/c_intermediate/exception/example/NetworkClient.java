package com.inflearn.lecture.c_intermediate.exception.example;

public class NetworkClient {
    
    private final String address;
    

    public NetworkClient(String address) {
        this.address = address;
    }
    
    public String connect () {
        System.out.println(STR."address 연결 성공 = \{address}");
        return "연결 성공";
    }

    public String diaConnect() {
        System.out.println("address 연결 해제 = " + address);
        return "연결 해제 성공";
    }

    public String sendMessage(String data) {
        System.out.println("데이터 전송 성공 = " + data);
        return "데이터 전송 성공";
    }
}

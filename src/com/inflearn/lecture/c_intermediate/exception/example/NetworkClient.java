package com.inflearn.lecture.c_intermediate.exception.example;

public class NetworkClient {
    
    private final String address;
    private boolean error;
    private boolean sendError;
    

    public NetworkClient(String address) {
        this.address = address;
        initError("sendError");
    }
    
    public String connect () {
        if (error) {
            System.out.println("연결 에러");
            return "연결 에러";
        }

        System.out.println(STR."address 연결 성공 = \{address}");
        return "연결 성공";
    }

    public String diaConnect() {
        System.out.println("address 연결 해제 = " + address);
        return "연결 해제 성공";
    }

    public String sendMessage(String data) {
        if (sendError) {
            System.out.println(address + "전송 실패: " + data);
            return "error";
        }

        System.out.println(STR."데이터 전송 성공 = \{data}");
        return "데이터 전송 성공";
    }

    public void initError(String data) {
        if (data.contains("sendError")) sendError = true;
        if (data.contains("error")) error = true;
    }
}

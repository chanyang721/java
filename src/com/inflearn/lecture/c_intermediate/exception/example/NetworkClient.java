package com.inflearn.lecture.c_intermediate.exception.example;

public class NetworkClient {
    
    private final String address;
    private boolean error;
    private boolean sendError;
    

    public NetworkClient(String address) {
        this.address = address;
    }
    
    public String connect () {
        if (error) {
            System.out.println("연결 에러");
            return "connect error";
        }

        System.out.println(STR."address 연결 성공 = \{address}");
        return "success";
    }

    public String disConnect() {
        System.out.println("address 연결 해제 = " + address);
        return "success";
    }

    public String sendMessage(String data) {
        if (sendError) {
            System.out.println(address + "전송 실패: " + data);
            return "send error";
        }

        System.out.println(STR."데이터 전송 성공 = \{data}");
        return "success";
    }

    public void initError(String data) {
        if (data.contains("sendError")) sendError = true;
        if (data.contains("error")) error = true;
    }
}

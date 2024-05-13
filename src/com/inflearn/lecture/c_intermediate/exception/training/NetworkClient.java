package com.inflearn.lecture.c_intermediate.exception.training;

public class NetworkClient {
    private final String address;
    private boolean connectError;
    private boolean sendError;


    public NetworkClient(String address) {
        this.address = address;
    }

    public String connect() throws NetworkClientException {
        if(connectError) throw new NetworkClientException("401", "connect failed");
        System.out.println("connect success");
        return "success";
    }

    public String disConnect() {
        System.out.println("서버 연결 해제");
        return "success";
    }

    public String send(String data) throws NetworkClientException {
        if(sendError) throw new NetworkClientException("402", "send failed");

        System.out.println(STR."send success: \{data}");
        return "success";
    }

    public void initError(String data) {
        if (data.equals("sendError")) sendError = true;
        if (data.equals("connectError")) connectError = true;
    }
}

package com.inflearn.lecture.c_intermediate.exception.example;

public class NetworkService {

    public String sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient network = new NetworkClient(address);

        network.initError(data); // 에러 발생 데이터 추가

        String connectResult = network.connect();
        if (isError(connectResult)) {
            network.disConnect();
            return "error";
        }

        String sendResult = network.sendMessage(data);
        if (isError(sendResult)) {
            network.disConnect();
            return "error";
        }

        network.disConnect();
        return "success";
    }

    private boolean isError(String reuslt) {
        return !reuslt.equals("success");
    }
}

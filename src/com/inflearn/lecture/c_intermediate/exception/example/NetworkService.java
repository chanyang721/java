package com.inflearn.lecture.c_intermediate.exception.example;

public class NetworkService {

    public static void main(String[] args) {
        /*
        * 정상 흐름과 예외 흐름의 분리
        *   - 가독성을 위해 분리
        *   -
        *
        *
        * 나와 다르게 구현한 것
        *   - 클래스 이름
        *       - Network -> NetworkClient
        *       - NetworkMain -> NetworkService
        *
        *   - error 발생 데이터 동적으로 할당
        * */
    }

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

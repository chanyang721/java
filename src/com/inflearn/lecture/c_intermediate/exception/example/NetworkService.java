package com.inflearn.lecture.c_intermediate.exception.example;

public class NetworkService {

    public static void main(String[] args) {
        /*
        * 데이터 전송 예시
        *
        *
        * 나와 다르게 구현한 것
        *   - 클래스 이름
        *       - Network -> NetworkClient
        *       - NetworkMain -> NetworkService
        * */
    }

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient network = new NetworkClient(address);
        network.connect();

        network.sendMessage(data);

        network.diaConnect();
    }
}

package com.inflearn.lecture.c_intermediate.exception.example;

public class NetworkService {

    public static void main(String[] args) {
        /*
        *
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

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient network = new NetworkClient(address);

        network.initError(data); // 에러 발생 데이터 추가

        network.connect();

        network.sendMessage(data);

        network.diaConnect();
    }
}

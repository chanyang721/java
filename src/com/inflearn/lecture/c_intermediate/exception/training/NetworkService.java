package com.inflearn.lecture.c_intermediate.exception.training;

public class NetworkService {

    public void sendMessage(String data) throws NetworkClientException {
        String address = "http://network.test.com";
        NetworkClient client = new NetworkClient(address);

        client.initError(data);

        client.connect();

        client.send(data);

        client.disConnect();
    }

}

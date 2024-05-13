package com.inflearn.lecture.c_intermediate.exception.training;

public class NetworkService {

    public void sendMessage(String data) throws NetworkClientException {
        String address = "http://network.test.com";
        NetworkClient client = new NetworkClient(address);

        client.initError(data);

        try {
            client.connect();

            client.send(data);
        }
        catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        finally {
            client.disConnect();
        }
    }

}

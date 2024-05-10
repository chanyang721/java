package com.inflearn.lecture.c_intermediate.nested.example;

public class Network {


    /* Network 클래스에서만 사용되는 NetworkMessage 클래스 */
    private static class NetworkMessage {
        private String message;

        public NetworkMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    /*  */
    public String sendMessage(String message) {
        NetworkMessage networkMessage = new NetworkMessage(message);
        return networkMessage.getMessage();
    }
}

package com.inflearn.lecture.c_intermediate.nested.example;

public class NetworkMain {

    public static void main(String[] args) {
        Network network = new Network();
        System.out.println("network.sendMessage() = " + network.sendMessage("테스트"));
    }
}

package com.inflearn.lecture.c_intermediate.exception.example;

import java.util.Scanner;

public class NetworkMain {

    public static void main(String[] args) {
        NetworkService networkService = new NetworkService();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("전송할 문자 : ");
            String data = scanner.nextLine();

            if (data.equals("exit")) break;

            networkService.sendMessage(data);

            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}

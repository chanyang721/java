package com.inflearn.lecture.c_intermediate.exception.training;

import java.util.Scanner;

public class NetworkMain {
    public static void main(String[] args) throws NetworkClientException {
        NetworkService service = new NetworkService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("전송할 문자: ");
            String line = scanner.nextLine();
            if(line.equals("exit")) break;

            service.sendMessage(line);
            System.out.println();
        }

        System.out.println("프로그램 종료");
    }
}

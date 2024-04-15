package com.inflearn.lecture.b_basic.class_.example;

import java.util.Scanner;

import static com.inflearn.lecture.b_basic.class_.example.ProductOrder.getTotalAmount;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // 버퍼 지연

        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " 번쨰 주문 정보를 입력하세요.");

            System.out.print("상품 명: ");
            String name = scanner.nextLine();

            System.out.print("상품 가격: ");
            int price = scanner.nextInt();

            System.out.print("상품 개수: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // 버퍼 지연

            orders[i] = ProductOrder.createOrder(name, price, quantity);
        }

        int totalAmount = getTotalAmount(orders);
        System.out.println("totalAmount :" + totalAmount);
    }
}

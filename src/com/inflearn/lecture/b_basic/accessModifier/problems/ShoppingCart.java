package com.inflearn.lecture.b_basic.accessModifier.problems;

public class ShoppingCart {
    private Item[] items = new Item[5];
    private int itemCounts = 0;
    /*
    * 다른 클래스의 필드를 다른 클래스에서 컨트롤하지 않는다 -> 캡슐화 안됨
    * */

    public void addItem (Item item) {
        if (itemCounts > items.length) {
            System.out.println("장바구니가 가득 차 있습니다.");
            return;
        }

        items[itemCounts] = item;
        itemCounts++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 리스트");

        for (int i = 0; i < itemCounts; i++) {
            Item item = items[i];
            System.out.println("상품 이름: " + item.getName() + "상품 가격: " + item.getTotalPrice());
        }

    }

    public void getTotalPrice() {
        System.out.println("장바구니에 담긴 전체 아이템 가격");
        int totalPrice = 0;
        for (int i = 0; i < itemCounts; i++) {
            Item item = items[i];
            System.out.println("상품 이름: " + item.getName() + "전체 상품 가격: " + item.getTotalPrice());

            totalPrice += item.getTotalPrice();
        }
    }
}

package com.inflearn.lecture.b_basic.accessModifier.problems;

public class ShoppingCartMain {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item mouse = new Item("마우스", 10_000, 1);
        Item keyBoard = new Item("키보드", 40_000, 1);
        Item pad = new Item("아이패드", 1_000_000, 1);

        cart.addItem(mouse);
        cart.addItem(keyBoard);
        cart.addItem(pad);

        cart.displayItems();

        cart.getTotalPrice();
    }
}

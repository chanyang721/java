package Lecture.Basic.Class.Example;

public class ProductOrder {
    Product product;
    int quantity;

    public static void main(String[] args) {
        Product[] products = {new Product(), new Product(), new Product()};
        for (int i = 0; i < products.length; i++) {
            products[i].name = "이름";
            products[i].price = 1000;
        }

        int totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].price;
        }

        ProductOrder[] orders = new ProductOrder[]{
            createOrder("CPU AMD 7800x3D", 1000, 1),
            createOrder("GPU 4090 ti super", 1000, 1),
            createOrder("POWER 1000W", 1000, 1)
        };

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 금액 :"  + totalAmount);
    }


    static ProductOrder createOrder (String name, int price, int quantity) {
        Product product = new Product();
        product.name = name;
        product.price = price;

        ProductOrder order = new ProductOrder();
        order.product = product;
        order.quantity = quantity;

        return order;
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (int i = 0; i < orders.length; i++) {
            totalAmount += orders[i].product.price;
        }

        return totalAmount;
    }
}

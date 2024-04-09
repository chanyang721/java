package Basic.Class.Example;

public class ProductOrder {

    public static void main(String[] args) {
        Product[] products = {new Product(), new Product(), new Product()};
        for (int i = 0; i < products.length; i++) {
            products[i].name = "이름";
            products[i].price = 1000;
            products[i].quantity = 1;
        }

        int totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].price;
        }

        System.out.printf("totalPrice: " + totalPrice);
    }
}

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new Product("milk", 300), 20);
        basket.add(new Product("butter", 50), 10);
        basket.add(new Product("milk", 300), 30);
        System.out.println(basket);
    }
}

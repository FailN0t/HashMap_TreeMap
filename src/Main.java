
public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add(new Product("milk", 300), 20);
        basket.add(new Product("butter", 75), 10);
        basket.add(new Product("milk", 300), 30);
        basket.add(new Product("Brod", 50), 10);
        System.out.println(basket);
    }
}

import java.util.HashMap;

public class Basket {
    private HashMap<Product, Integer> products;

    public Basket() {
        this.products = new HashMap<>();
    }

    public void add(Product product, int count){
        if(!products.containsKey(product)){
            products.put(product, 0);
        }
        products.put(product, products.get(product) + count);
    }
    public void add(Product product){
        add(product,1);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(Product product: products.keySet()){
            stringBuilder.append(product);
            stringBuilder.append(" - ").append(products.get(product));
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}

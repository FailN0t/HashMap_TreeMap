import java.util.HashMap;
import java.util.Map;

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
        for(Map.Entry<Product, Integer> entry : products.entrySet()){
            Product product = entry.getKey();
            stringBuilder.append(product);
            stringBuilder.append(" - ").append(entry.getValue());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Car> cars = new HashMap<>();
        cars.put("А765мт77", new Car("А765мт77"));
        cars.put("А6370077", new Car("А6370077"));
        cars.put("У789кч77", new Car("У789кч77"));
        cars.put("Т372мт199", new Car("Т372мт199"));
        cars.put("Т372мт199", new Car("3242432341"));

        System.out.println(cars.get("Т372мт199"));
    }
}

package Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Supplier{
    private final String NAME = "Healthy Shop";
    Map<String, Integer> products = new HashMap<>();

    public HealthyShop() {
        fillMap();
    }

    private void fillMap() {
        products.put("Potato", 150);
        products.put("Tomato", 150);
        products.put("Poor", 150);
    }

    public void updateShop(String nameOfProduct, Integer quantity) {
        Integer result = products.get(nameOfProduct) - quantity;

        products.put(nameOfProduct, result);
    }

    public void process(Order order) {
        if (products.containsKey(order.getNameOfProduct()) && products.get(order.getNameOfProduct()) >= order.getQuantity()) {
            updateShop(order.getNameOfProduct(), order.getQuantity());
            System.out.println("Zamówienie sfinalizowane");
            System.out.println("W schowku zostało " + products.get(order.getNameOfProduct()));
        } else {
            System.out.println("Niestety Twojego zamówienia nie udało sie sfinalizowac");
        }
    }

    @Override
    public String name() {
        return NAME;
    }
}

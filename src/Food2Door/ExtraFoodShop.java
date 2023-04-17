package Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Supplier{
    private final String NAME = "Extra Food Shop";
    Map<Integer, String> products = new HashMap<>();

    public ExtraFoodShop() {
        fillMap();
    }

    private void fillMap() {
        products.put(13, "Apple");
        products.put(15, "Bread");
        products.put(150, "Poor");
    }

    public void process(Order order) {

    }

    @Override
    public String name() {
        return NAME;
    }
}

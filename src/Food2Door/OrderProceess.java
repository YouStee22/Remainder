package Food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderProceess {
    Map<String, Supplier> suppliers = new HashMap<>();

    public OrderProceess() {
        fillSuppliers();
    }

    private void fillSuppliers() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        suppliers.put("Apple", extraFoodShop);
        suppliers.put("Poor", extraFoodShop);
        suppliers.put("Bread", healthyShop);
        suppliers.put("Potato", healthyShop);
        suppliers.put("Tomato", glutenFreeShop);
        suppliers.put("Kiwi", glutenFreeShop);
    }

    public void check(Order order) {
        if (suppliers.containsKey(order.getNameOfProduct())) {
           suppliers.get(order.getNameOfProduct()).process(order);
        } else {
            System.out.println("Nie ma dostawcy spełniającego Twoje zamówienie");
        }
    }


}

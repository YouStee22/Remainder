package Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Supplier{
    private final String NAME = "Gluten Free Shop";
    Map<String, Integer> products = new HashMap<>();

    public GlutenFreeShop() {
        fillMap();
    }

    private void fillMap() {
        products.put("Tomato", 1399);
        products.put( "Bread", 15);
        products.put("Potato", 150);
    }

    public void updateShop(String nameOfProduct, Integer quantity) {
        Integer depo = products.get(nameOfProduct) - quantity;

        products.put(nameOfProduct, depo);
    }

    public void process(Order order) {
        if (products.containsKey(order.getNameOfProduct()) &&  products.get(order.getNameOfProduct()) >= order.getQuantity()) {
            updateShop(order.getNameOfProduct(), order.getQuantity());

            System.out.println("The order has been transferred for execution");
            System.out.println("Thank you for using the services" + NAME);
            System.out.println("Ilość w schowku " + products.get(order.getNameOfProduct()));
        } else {
            System.out.println("The selected product is not available.");
        }
    }

    @Override
    public String name() {
        return NAME;
    }
}

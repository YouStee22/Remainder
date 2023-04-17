package NormalShop;

import java.util.HashMap;
import java.util.Map;

public class GetRent {
    private Map<String, Integer> cars = new HashMap<>();

    public GetRent() {
        fillMap();
    }

    private void fillMap() {
        cars.put("Mazda", 5);
        cars.put("Toyota", 132);
        cars.put("BMW", 1);
        cars.put("KIA", 6);
        cars.put("Honda", 0);
    }

    public void update(String nameOfCar, Integer quantity) {
        Integer up = cars.get(nameOfCar) - quantity;
        cars.put(nameOfCar, up);
        System.out.println("Stan aut marki " + nameOfCar + " w magazynie to " + up);
    }

    public void getRent(Order order) {
        if (cars.containsKey(order.getTypeOfProduct())  &&  cars.get(order.getTypeOfProduct()) >= order.getQuantity()) {

            System.out.println("Wynajem udany :)");
            System.out.println("Auto " + order.getTypeOfProduct() + " w ilości " + order.getQuantity() + " dla " + order.getNameOfAuthor() + " zosatło pomyślnie wynajęte");
            update(order.getTypeOfProduct(), order.getQuantity());
        } else {
            System.out.println("Nie tylu aut na stanie");
        }
    }
}

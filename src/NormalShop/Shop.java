package NormalShop;

public class Shop {
    public static void main(String[] args) {
        Order order = new Order("Thomas", "Toyota", 3);

        GetRent getRent = new GetRent();
        getRent.getRent(order);
    }
}

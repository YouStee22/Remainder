package Food2Door;

public class Application {
    public static void main(String[] args) {
        Order order1 = new Order(12, "Apple");
        Order order2 = new Order(131, "Potato");
        Order order3 = new Order(1242, "Tomato");

        OrderProceess orderProceess = new OrderProceess();
        orderProceess.check(order1);
        orderProceess.check(order2);
        orderProceess.check(order3);


    }
}

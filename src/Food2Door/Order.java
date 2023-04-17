package Food2Door;

public class Order {
    private String nameOfProduct;
    private int quantity;

    public Order (int quantity, String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getQuantity() {
        return quantity;
    }
}

package NormalShop;

public class Order {
    private String nameOfAuthor;
    private String typeOfProduct;
    private int quantity;

    public Order(String nameOfAuthor, String typeOfProduct, int quantity) {
        this.nameOfAuthor = nameOfAuthor;
        this.typeOfProduct = typeOfProduct;
        this.quantity = quantity;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public int getQuantity() {
        return quantity;
    }
}

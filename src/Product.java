public class Product {
    int id,quantity,price,discount;
    String name,imagedir;

    public Product(int id, int quantity, int price, int discount, String name, String imagedir) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.name = name;
        this.imagedir = imagedir;
    }
}

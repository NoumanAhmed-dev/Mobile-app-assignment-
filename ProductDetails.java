class Product {
    private String name;
    private double price;
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { if (price > 0) this.price = price; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}
public class ProductDetails {
    public static void main(String[] args) {
        Product p = new Product();
        p.setName("Laptop"); p.setPrice(150000);
        System.out.println(p.getName());
        System.out.println("Price: " + p.getPrice());
    }
}

package OOP.ShopMangements;

public abstract class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        name = name;
        this.price = price;
    }
    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Taxableame = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Ten San Pham: " + this.name);
        System.out.println("Gia san pham: " + this.price);
    }
}

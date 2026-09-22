package OOP.ShopMangements;

public class Electronics extends Product implements Taxable{
    private int warrantyPeriod;

    public Electronics(String id, String name, double price, int warrantyPeriod) {
        super(id, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public Electronics(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public double calculateDiscount() {
        return this.price * 0.10;
    }
    public double calculateTax() {
        return this.price * 0.10;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bảo hành: " + this.warrantyPeriod + " tháng");
    }
}

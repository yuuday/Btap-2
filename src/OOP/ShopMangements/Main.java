package OOP.ShopMangements;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Electronics("E01", "Laptop Dell XPS", 25000000, 12));
        for (Product product : productList) {
            product.displayInfo();
            System.out.println("Số tiền giảm: " + product.calculateDiscount() + " VNĐ");
            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                System.out.println("Tiền thuế: " + taxableProduct.calculateTax() + " VNĐ");
            }
        }
    }
}

package lesson4.exercise4_3;

public class Product {
    private String productName;
    private float price;
    private int quantity;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(float price) {
        if (price <= 0) {
            System.out.println("Gia san pham khong hop le");
        } else {
            this.price = price;
        }
    }

    public float getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.out.println("So luong san pham khong hop le");
        } else {
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    float getTotalValue() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("Ten san pham: " + productName);
        System.out.println("Gia san pham: " + price);
        System.out.println("So luong san pham: " + quantity);
        System.out.println("Tong tien san pham: " + getTotalValue());
    }

    static void main() {
        Product pr = new Product();
        pr.setProductName("chai nuoc");
        // pr.setPrice(0);
        pr.setPrice(5000);
        // pr.setQuantity(-7);
        pr.setQuantity(2);
        pr.displayProduct();
    }
}

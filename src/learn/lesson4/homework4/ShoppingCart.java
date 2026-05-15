package lesson4.homework4;

public class ShoppingCart {
    int cartId;
    String ownerName;
    int totalItems;
    double totalPrice;

    public ShoppingCart() {

    }

    public ShoppingCart(int cartId, String ownerName) {
        this.cartId = cartId;
        this.ownerName = ownerName;
        this.totalItems = 0;
        this.totalPrice = 0.0;
    }

    void addItem(String itemName, double price) {
        this.totalItems += 1;
        this.totalPrice += price;
        System.out.println("Đã thêm: " + itemName);

    }

    void addItem(String itemName, double price, int quantity) {
        if (quantity > 0) {
            this.totalItems += quantity;
            this.totalPrice += (price * quantity);
            System.out.println("Da them " + quantity + " x " + itemName);
        } else {
            System.out.println("So luong khong hop le!");
        }
    }

    void removeItem(double price) {
        if (totalItems > 0) {
            this.totalItems -= 1;
            this.totalPrice -= price;
            System.out.println("Da xoa mot san pham co gia " + price);
        } else {
            System.out.println("Gio hang dang trong, khong the xoa!");
        }
    }

    void displayCart() {
        System.out.println("Gio hang: " + cartId + " ---");
        System.out.println("Chu so huu " + ownerName);
        System.out.println("Tong so luong: " + totalItems);
        System.out.println("Tong tien: " + totalPrice + " VND");
    }

}

package lesson2;

public class exercise1_2 {
    static void main() {
        // Bài 1
        int distance = 12;
        if (distance < 5) {
            System.out.println("Miễn phí giao hàng");
        } else if (distance > 5 && distance < 20) {
            System.out.println("Phí giao hàng: 20.000VNĐ");

        } else {
            System.out.println("Phí giao hàng 50.000VNĐ");
        }

        // Bài 2
        int choice = 2;

        switch (choice) {
            case 1 -> System.out.println("Bạn đã chọn Nước suối. Giá: 10.000 VND");
            case 2 -> System.out.println("Bạn đã chọn Trà sữa. Giá: 30.000 VND");
            case 3 -> System.out.println("Bạn đã chọn Cà phê đen. Giá: 20.000 VND");
            default -> System.out.println("Lựa chọn không hợp lệ");
        }
    }
}

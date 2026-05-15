package lesson3;

import java.util.Scanner;

public class excercise2_2 {
    static void main() {

        // Nhap ho ten tu ban phim
        Scanner sc = new Scanner(System.in); // la mot class sử dụng để đọc dữ liệu nhập vào từ nhiều nguồn khác nhau, phổ biến nhất là từ bàn phím (System.in)
        String name;
        System.out.print("Nhap ho va ten: ");
        name = sc.nextLine();

        // Xoa khoang trang dau cuoi
        name = name.trim();

        // In hoa
        name = name.toUpperCase();

        // Hien thi chuoi sau khi xu ly va do dai chuoi
        System.out.println("Chuoi sau khi xu ly: " + name + " va co do dai chuoi la: " + name.length());

        // Kiem tra co chua tu khoa
        String timkiem;
        System.out.print("Nhap ki tu muon tim kiem trong ten: ");
        timkiem = sc.nextLine();
        if (name.toLowerCase().contains(timkiem.toLowerCase())) {
            System.out.println("Có chua ki tu: " + timkiem);
        } else {
            System.out.println("Khong chua ki tu: " + timkiem);
        }

    }
}

package lesson3;

import java.util.Scanner;

public class homework2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int sobai;
        System.out.print("Nhap so bai tap muon xem: ");
        sobai = sc.nextInt();

        switch (sobai) {
            case 1 -> Bai1();
            case 2 -> Bai2();
            default -> System.out.println("Khong co so bai nay!");
        }

    }

    static void Bai1() {
        // Bai 1
        System.out.println("Bai 1: ");
        // Khoi tao mang
        int[] a = { 4, 8, 5, 9, 3 };

        // tinh tong diem so trong mang
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        // dem hoc sinh thi do (5 diem tro len)
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 5) {
                dem++;
            }
        }

        // In ket qua
        System.out.println("Tong diem so la:  " + sum);
        System.out.println("So luong hoc sinh thi do la: " + dem);
    }

    static void Bai2() {
        // Bai 2
        System.out.println("Bai 2:");
        // Khoi tao van ban
        String course = "  java programing  ";
        // Xoa khoang trang dau cuoi
        course = course.trim();

        // In hoa
        course = course.toUpperCase();

        // Hien thi chuoi sau khi xu ly va do dai chuoi
        System.out.println("Chuoi sau khi xu ly: " + course + " va co do dai chuoi la: " + course.length());

        // Kiem tra co chua tu khoa
        if (course.contains("JAVA")) {
            System.out.println("Có chua ki tu JAVA");
        } else {
            System.out.println("Khong chua ki tu JAVA");
        }

    }
}

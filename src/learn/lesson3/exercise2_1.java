package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class exercise2_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        // Nhap phan tu cua mang
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        // duyet mang
        System.out.println(Arrays.toString(a));

        // tinh tong phan tu trong mang
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        System.out.println("Tong gia tri cua mang la " + sum);

        // dem so chan trong mang
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                dem++;
            }
        }
        System.out.println("So phan tu trong mang chia het cho 2 la " + dem);
    }
}
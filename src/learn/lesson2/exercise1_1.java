package lesson2;

public class exercise1_1 {
    static void main() {

        // Bài 1
        String name = "Trang";
        int age = 24;
        float average = 9.5f;
        boolean daDongHocPhi = true;

        if (daDongHocPhi) {
            System.out.println(
                    "Ten toi la " + name + " nam nay " + age + " tuoi, toi co diem trung binh la " + average
                            + " va da dong hoc phi");

        } else {
            System.out.println(
                    "Ten toi la " + name + " nam nay " + age + " co diem trung binh la " + average
                            + " va chua dong hoc phi");
        }

        // Bài 2
        int a = 15;
        int b = 4;
        int chiaphannguyen = a / b;
        int chialayphandu = a % b;
        a++; //a = a + 1
        b += 10; // b = b + 10
        System.out.println("Chia lay phan nguyen: " + chiaphannguyen);
        System.out.println("Chia lay phan du: " + chialayphandu);
        System.out.println("a sau khi tang: " + a);
        System.out.println("b sau khi cong 10: " + b);

    }

}

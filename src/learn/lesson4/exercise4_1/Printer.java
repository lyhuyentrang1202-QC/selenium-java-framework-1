package lesson4.exercise4_1;

public class Printer {

    void print(int n) {
        System.out.println("Số nguyên: " + n);
    }

    void print(double d) {
        System.out.println("Số thực: " + d);
    }

    void print(String s) {
        System.out.println("Chuỗi: " + s);
    }

    public static void main(String[] args) {
        Printer pr = new Printer();
        pr.print(100);
        pr.print(15.5);
        pr.print("Java OOP");
    }
}

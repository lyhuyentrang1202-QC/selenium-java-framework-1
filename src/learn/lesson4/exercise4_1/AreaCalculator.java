package lesson4.exercise4_1;

public class AreaCalculator {

    int area(int side) {
        return side * side;
    }

    int area(int length, int width) {
        return length * width;
    }

    double area(double radius) {
        return Math.PI * radius * radius;
    }

    static void main() {
        AreaCalculator s = new AreaCalculator();
        int hv = s.area(3);
        System.out.println("Dien tich hinh vuong la: " + hv);
        int hcn = s.area(4, 5);
        System.out.println("Dien tich hinh vuong la: " + hcn);
        double ht = s.area(5.5);
        System.out.println("Dien tich hinh tron la: " + ht);

    }
}

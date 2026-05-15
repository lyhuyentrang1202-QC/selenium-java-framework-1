package lesson4.exercise4_1;

public class Concatenator {

    String concat(String a, String b) {
        return a + b;
    }

    String concat(String a, String b, String c) {
        return concat(a, b) + c;
    }

    String concat(int a, int b) {
        return a + "" + b;
    }

    static void main() {
        Concatenator chuoi = new Concatenator();
        String chuoi1 = chuoi.concat("Xin ", "chao");
        System.out.println(chuoi1);
        String chuoi2 = chuoi.concat("Tam ", "biet ", "nhe");
        System.out.println(chuoi2);
        String chuoi3 = chuoi.concat(5, 6);
        System.out.println(chuoi3);
    }
}

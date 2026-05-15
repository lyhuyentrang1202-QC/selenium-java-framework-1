package lesson4.exercise4_2;

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println(cal.add(2, 3));
        System.out.println(cal.add(2.5, 3.5));
        System.out.println(cal.add(1, 2, 3));

        Logger logger = new Logger();

        logger.log("Trang");
        logger.log("404", "high");
        logger.log("LoginTest", "Enter password", true);
    }
}

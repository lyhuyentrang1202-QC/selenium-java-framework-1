package lesson5.exercise5_1;

public class Main {
    static void main() {

        Car myCar = new Car("Toyota", 2022, 4);

        Motorcycle myMoto = new Motorcycle("Vision", 2021, true);

        System.out.println("Car Info");
        myCar.displayInfo();

        System.out.println("Motorcycle Info");
        myMoto.displayInfo();
    }
}

package lesson5.homework5_1;

public class Main {
    static void main() {

        FullTimeEmployee ftEmp = new FullTimeEmployee("Nguyen Van A", 10000, 2000);

        PartTimeEmployee ptEmp = new PartTimeEmployee("Nguyen Van B", 0, 40, 150);

        ftEmp.displayInfo();

        ptEmp.displayInfo();
    }
}

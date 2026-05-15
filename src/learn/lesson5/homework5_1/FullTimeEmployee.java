package lesson5.homework5_1;

class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thuong:  " + bonus + " -> Tong thu nhap: " + getSalary());
    }
}

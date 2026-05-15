package lesson5.homework5_1;

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(
                " Gio lam:  " + hoursWorked + ", Don gia:  " + hourlyRate + "-> Tong thu nhap:  " + getSalary());
    }
}

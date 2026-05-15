package lesson5.homework5_1;

class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double getSalary() {
        return baseSalary;
    }

    public void displayInfo() {
        System.out.print("Nhan vien " + name + " co luong co ban la:  " + baseSalary);
    }
}

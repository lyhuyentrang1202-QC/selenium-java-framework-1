package lesson5.exercise5_1;

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (hasSidecar) {
            System.out.println("Has sidecar: Yes");
        } else {
            System.out.println("Has sidecar: No");
        }
    }
}

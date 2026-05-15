package lesson5.exercise5_2;

abstract class BankAccount {
    protected double balance;

    // Constructor nhận số dư ban đầu
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Abstract method: không có thân hàm, lớp con bắt buộc phải override
    public abstract double calculateInterest();

    // Method cụ thể: dùng chung cho mọi loại tài khoản
    public void displayBalance() {
        double interest = calculateInterest();
        System.out.println("So du hien tai: " + balance);
        System.out.println("Tien lai tinh duoc: " + interest);
        System.out.println("So du sau lai: " + (balance + interest));
    }
}

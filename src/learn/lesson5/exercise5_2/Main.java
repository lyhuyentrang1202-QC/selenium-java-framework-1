package lesson5.exercise5_2;

public class Main {
    static void main() {

        BankAccount savings = new SavingsAccount(10000000);

        BankAccount checking = new CheckingAccount(5000000);

        System.out.println("=> Tài khoản tiết kiệm:");
        savings.displayBalance();

        System.out.println("\n=> Tài khoản thanh toán:");
        checking.displayBalance();
    }
}

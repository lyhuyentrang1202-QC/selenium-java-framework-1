package lesson4.exercise4_3;

public class TestAccount {
    private String username, password;
    boolean active;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("Password qua ngan!");
        } else {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setIsActive(boolean active) {
        this.active = active;

    }

    public boolean getIsActive() {
        return active;
    }

    void displayInfo() {

        System.out.println("Username: " + this.username);

        System.out.println("Password: *****");

        System.out.println("Status: " + active);
    }

    static void main() {
        TestAccount acc = new TestAccount();
        acc.setUsername("trang");
        acc.setPassword("123456");
        acc.setIsActive(true);
        acc.displayInfo();
    }
}

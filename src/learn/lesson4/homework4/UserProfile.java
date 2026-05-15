package lesson4.homework4;

public class UserProfile {

    private String fullName;
    private String email;
    private int age;
    private String role;

    public UserProfile() {
    }

    public UserProfile(String fullName, String email) {
        this.fullName = fullName;
        setEmail(email);
    }

    public UserProfile(String fullName, String email, int age, String role) {
        this.fullName = fullName;
        setEmail(email);
        setAge(age);
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email khong hop le!");
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("Tuoi khong hop le!");
        }
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void displayProfile() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }

    public static void main(String[] args) {
        UserProfile user1 = new UserProfile("Nguyen Van A", "nguyenvana.gmail.com", 15, "QA");
        user1.displayProfile();
        UserProfile user2 = new UserProfile("Nguyen Van B", "b@gmail.com", 25, "Admin");
        user2.displayProfile();
    }
}

package lesson5.homework5_2;

class Animal {
    protected String name;

    public void makeSound() {
        System.out.println("Some sound...");
    }

    // final method: Các lớp con không được phép override
    public final void breathe() {
        System.out.println(name + " is breathing");
    }
}

package lesson5.homework5_2;

class Dog extends Animal {

    public Dog() {
        this.name = "Dog";
    }

    @Override
    public void makeSound() {
        System.out.print("Woof! ");
    }

    public static final String SPECIES = "Canis lupus familiaris";
}

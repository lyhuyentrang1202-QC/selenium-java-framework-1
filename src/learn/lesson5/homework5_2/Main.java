package lesson5.homework5_2;

public class Main {
    static void main() {
        
        System.out.println("Species: " + Dog.SPECIES);

        GoldenRetriever myGold = new GoldenRetriever();

        myGold.makeSound();
        myGold.breathe();
        myGold.fetch();
    }
}

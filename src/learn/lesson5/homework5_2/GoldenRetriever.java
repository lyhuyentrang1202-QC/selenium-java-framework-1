package lesson5.homework5_2;

class GoldenRetriever extends Dog {
    public GoldenRetriever() {
        this.name = "Golden Retriever";
    }

    @Override
    public void makeSound() {
        super.makeSound(); 
        System.out.println("(Golden Retriever)");
    }

    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}

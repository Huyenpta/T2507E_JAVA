package main.asm4;

public class Elephant extends Animal{
    public Elephant(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Elephant eats grass");
    }
}

package main.asm4;

public class Bike extends Vehicle {
    public Bike() {
    }

    public Bike(String name, Integer maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Bike is riding");
    }
}

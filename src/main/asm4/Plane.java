package main.asm4;

public class Plane extends Vehicle{
    public Plane() {
    }

    public Plane(String name, Integer maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Plane is flying");
    }
}

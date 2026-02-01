package main.asm4;

public class Main {
    public static void main(String[] args){
        FullTimeEmployee em = new FullTimeEmployee("NV01", "Nguyễn Văn A",30000) ;
        System.out.println(em.Employees());
        PartTimeEmployee pe = new PartTimeEmployee("NV01", "Nguyễn Văn A", 150000.0, 5);
        System.out.println(pe.Employees());
        Vehicle[] vehicle = {
                new Car("Toyota",30),
                new Bike("Thống nhất", 15),
                new Train("Tàu Shinkan",50),
                new Plane("Boing",60),
        };
        for ( Vehicle v : vehicle) {
            v.move();
        }
        Animal[] animals={
                new Lion("Lion"),
                new Elephant("Elephant"),
                new Monkey("Monkey")
        };
        for (Animal a: animals){
            a.eat();
        }
    }
}

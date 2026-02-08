package main.asm7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Employee[] em= {
            new Developer("D01", "An", 10000000.0, 20),
            new Tester("T01", "Binh", 9000000.0, 15),
            new Manager("M01", "Cuong", 15000000.0, 5)
        };
        for (Employee e: em ){
            e.showInfo();
        }
    }
}

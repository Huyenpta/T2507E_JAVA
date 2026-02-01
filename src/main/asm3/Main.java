package main.asm3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    ArrayList<Product> sp = new ArrayList<>();

    sp.add(new ClothingProduct("SP01","Áo Phông",30000.0,"L"));
    sp.add(new FoodProduct("FO01","Bánh bông lan",15000.0,15));
    sp.add(new ElectronicProduct("E01","Máy sấy E100",150000.0,24));

    for (Product p : sp){
        System.out.println(p.getinfo());
    }
    }
}

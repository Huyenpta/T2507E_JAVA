package main.session5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Product> sp = new ArrayList<>();

        sp.add(new FoodProduct("F01", "Sữa tươi", 30000.0, 7));
        sp.add(new FoodProduct("F02", "Bánh mì", 15000.0, 2));
        sp.add(new ElectronicProduct("E01", "Tai nghe", 500000.0, 12));
        sp.add(new ElectronicProduct("E02", "Chuột không dây", 300000.0, 6));
        sp.add(new ClothingProduct("AP01", "Áo Phông", 30000.0,"L"));
        sp.add(new ClothingProduct("Q01", "Quần Jean", 35000.0,"L"));

        for (Product p : sp) {
            System.out.println(p.getInfo());
            System.out.println("Giá sau giảm: " + p.calculateDiscountedPrice());
        }
    }
}

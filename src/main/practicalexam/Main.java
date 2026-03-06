package main.practicalexam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sp = new Scanner(System.in);
        Product p = new Product();

        System.out.println("ID:");
        p.setId(sp.nextInt());
        sp.nextLine();

        System.out.println("Name:");
        p.setName(sp.nextLine());

        System.out.println("Thumbnail:");
        p.setThumbnail(sp.nextLine());

        System.out.println("Price:");
        p.setPrice(sp.nextDouble());

        System.out.println("Quantity:");
        p.setQty(sp.nextInt());
        sp.nextLine();

        System.out.println("Description:");
        p.setDescription(sp.nextLine());

        System.out.println("Product information:");
        p.displayInfo();

        System.out.println("Order quantity:");
        int orderQty = sp.nextInt();

        if(p.checkAvailability(orderQty)){

            double total = p.placeOrder(orderQty);

            System.out.println("Đặt hàng thành công!");
            System.out.println("Tổng giá " + total);
            System.out.println("Số lượng còn lại: " + p.getQty());

        }else{

            System.out.println("Hàng trong kho không đủ");

        }
        sp.close();

    }
}

package main.practicalexam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sp = new Scanner(System.in);
        Product p = new Product();

        System.out.println("Mã sản phẩm:");
        p.setId(sp.nextInt());
        sp.nextLine();

        System.out.println("Tên sản phẩm:");
        p.setName(sp.nextLine());

        System.out.println("Thumbnail:");
        p.setThumbnail(sp.nextLine());

        System.out.println("Giá:");
        p.setPrice(sp.nextDouble());

        System.out.println("Số lượng:");
        p.setQty(sp.nextInt());
        sp.nextLine();

        System.out.println("Mô tả:");
        p.setDescription(sp.nextLine());

        System.out.println("Hiển thị thông tin sản phẩm:");
        p.displayInfo();

        System.out.println("Số lượng đặt hàng:");
        int orderQty = sp.nextInt();

        if(p.checkAvailability(orderQty)){

            double total = p.placeOrder(orderQty);

            System.out.println("Đặt hàng thành công!");
            System.out.println("Tổng giá " + total);
            System.out.println("Số lượng còn lại: " + p.getQty());

        }else{

            System.out.println("Hàng trong kho không đủ");

        }

    }
}

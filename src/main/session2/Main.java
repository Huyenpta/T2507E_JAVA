package main.session2;

public class Main {
    public static void main(String[] args){
        //program
        //Car c = new Car();// tạo 1 object từ class Car
        Car c;
        c = new Car();// c là một biến, là dữ liệu được tạo ra từ một bản vẽ
        int x = 10;
        c.brand = "Toyota";
        c.year = 2020;
        c.run();
        c.maintain();

        System.out.println("Hãng xe: "+c.brand);
        //boolean check = c.checkDate(c.year);
        boolean check = c.checkDate();
        if(check){
            System.out.println("Xe đang còn hạn dùng");
        }else {
            System.out.println("Xe hết hạn dùng");
        }
        Car b = new Car("BMW", 2009);
        b.year = 2009;
        //b.checkDate();
        Tamgiac tg= new Tamgiac(3,4,5);
        System.out.println ("Chu vi:" +tg.chuVi());
        System.out.println ("Diện tích:" +tg.dienTich());

        // Khởi tạo phân số f1 = 1/2 và f2 = 1/3
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(1, 8);

        // Tính toán
        Fraction tong = f1.add(f2);
        Fraction tich = f1.mul(f2);
        Fraction s = f1.sub(f2);
        Fraction d = f1.div(f2);

        // In kết quả theo phong cách của bạn
        System.out.print("Phân số 1: "); f1.inPhanSo();
        System.out.print("Phân số 2: "); f2.inPhanSo();

        System.out.print("Tổng 2 phân số: ");
        tong.inPhanSo();

        System.out.print("Tích 2 phân số: ");
        tich.inPhanSo();

        System.out.print("Trừ 2 phân số: ");
        s.inPhanSo();

        System.out.print("Chia 2 phân số: ");
        d.inPhanSo();
    }
}

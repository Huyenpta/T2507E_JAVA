package main.session2;

public class Car {
    //attribute: thông tin của các đối tượng thực ra là biến
    String brand; // class variable
    Integer year;
    // constructor - Hàm khởi tạo
    public Car(){ //hàm khởi tạo không tham số
        System.out.println("ABC xyz..."); // hàm tự động chạy khi tạo đối tượng
    }
    // Hàm khởi tạo có nhiều dạng khác nhau
    //public Car(String x, Integer y){ //Hàm khởi tạo đầy đủ tham số
    public Car(String brand, Integer year){ //Hàm khởi tạo đầy đủ tham số
        //System.out.println("123456...");
        this.brand = brand;
        this.year = year;

    }

    //method - behavior
    public void run(){
        System.out.println("Car is running...");
    }

    public void maintain(){
        System.out.println("Car is maintaining");
    }

    //public boolean checkDate(int yearP){
    public boolean checkDate(){
        //kiểm tra xem năm sản xuất đã quá hạn chưa, giả định hạn 10 năm
        int now = 2026;
        int yearP = this.year; //đối tượng ngầm định của nó trong class
        if (now - yearP >10){
            return false;
        }else {
            return true;
        }
    }
}

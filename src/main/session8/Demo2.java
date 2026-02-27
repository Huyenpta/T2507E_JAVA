package main.session8;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args){
        String connecttionString = "jdbc:mysql://localhost:3306/t2507e";
        String user = "root";
        String password = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        Scanner input = new Scanner(System.in);
        try {
            Class.forName(driver);
            Connection cnn = DriverManager.getConnection(connecttionString,user,password);
            System.out.println("Nhập tên môn học:");
            String name = input.nextLine();
            System.out.println("Nhập số giờ:");
            int hour = input.nextInt();
            String sql = "insert into subjects(name,hours) values(?,?)";
            PreparedStatement pt = cnn.prepareStatement(sql);
            pt.setString(1,name);
            pt.setInt(2,hour);
            pt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

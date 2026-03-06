package main.session8;

import main.database.Database;

import java.sql.*;
import java.time.LocalDate;

public class Demo1 {
    public static void main(String[] args){

        try {
            Database db = Database.getInstance();
            //lấy thông tin sinh viên
            String sql = "select * from students";
            Statement stt = db.getStatement();//Sửa dữ liệu lấy db vào chỗ này
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()){
                Integer x = rs.getInt("id");
                String y = rs.getString("name");
                LocalDate z = rs.getDate("dob").toLocalDate();
                Integer d = rs.getInt("mark");
                System.out.println(x+"--"+y+"--"+z+"--"+d);
            }
            //Thêm 1 sinh viên vào table
            //String sql1 = "insert into students(name,dob,mark) values ('Nguyễn Mai', '2001-01-03', 6)";
            //stt.execute(sql1); //kiểu thực thi update
            String sql2 = "insert into students(name,dob,mark) values(?,?,?)";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setString(1,"Nguyễn Công Tiến");
            pt.setDate(2,Date.valueOf("1990-09-27"));
            pt.setInt(3,9);
            pt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

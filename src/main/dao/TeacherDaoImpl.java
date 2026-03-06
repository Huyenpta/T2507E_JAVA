package main.dao;

import main.database.Database;
import main.entity.Teacher;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TeacherDaoImpl implements BaseDao<Teacher, Integer>{
    private Database db;
    public TeacherDaoImpl(){
        this.db = Database.getInstance();
    }

    @Override
    public ArrayList<Teacher> getAll() {
        ArrayList<Teacher> arr = new ArrayList<>();
        try {
            Statement st = db.getStatement();
            String sql = "SELECT * FROM teachers";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                arr.add(new Teacher(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email")
                ));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }

    @Override
    public boolean create(Teacher teacher) {
        try {
            String sql="INSERT INTO teachers";
            PreparedStatement pt = db.getPreparedStatement(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Teacher teacher) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }
}

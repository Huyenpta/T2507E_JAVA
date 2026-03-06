package main.dao;

import main.database.Database;
import main.entity.Subject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SubjectDaoImpl implements SubjectDao{
    private Database db;

    public SubjectDaoImpl(){
        this.db = Database.getInstance();
    }
    @Override
    public ArrayList<Subject> getAll() {
        ArrayList<Subject> arr = new ArrayList<>();
        try {
            Statement st = db.getStatement();
            String sql = "SELECT * FROM subjects";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                arr.add(new Subject(
                   rs.getInt("id"),
                   rs.getString("name"),
                   rs.getInt("hours")
                ));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }

    @Override
    public boolean create(Subject subject) {
        try {
            String sql = "INSERT INTO subjects(name,hours) VALUES(?,?)";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setString(1,subject.getName());
            pt.setInt(2,subject.getHours());
            return pt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Subject subject) {
        try {
            String sql = "UPDATE subjects SET name=?, hours=? WHERE id=?";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setString(1,subject.getName());
            pt.setInt(2,subject.getHours());
            pt.setInt(3,subject.getId());
            return pt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        try {
            String sql = "DELETE FROM subjects WHERE id =?";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setInt(1,id);
            return pt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }


}

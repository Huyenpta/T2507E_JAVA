package main.dao;

import main.database.Database;
import main.entity.Class;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ClassDaoImpl implements BaseDao<Class, Integer>{
    private Database db;
    public ClassDaoImpl(){
        this.db = Database.getInstance();
    }



    @Override
    public ArrayList<Class> getAll() {
        ArrayList<Class> arr = new ArrayList<>();
        try {
            Statement st = db.getStatement();
            String sql = "SELECT * FROM classes";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                arr.add(new Class(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("room")
                ));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }

    @Override
    public boolean create(Class aClass) {
        try {
            String sql = "INSERT INTO classes(name,room) VALUES(?,?)";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setString(1, aClass.getName());
            pt.setString(2, aClass.getRoom());
            return pt.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Class aClass) {
        try {
            String sql = "UPDATE classes SET name=?, room =? WHERE id=?";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setString(1, aClass.getName());
            pt.setString(2, aClass.getRoom());
            pt.setInt(3,aClass.getId());
            return pt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        try {
            String sql = "DELETE FROM classes WHERE id =? ";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setInt(1,id);
            return pt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Class findById(Integer id) {
        return null;
    }
}

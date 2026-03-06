package main.session8;

import main.dao.StudentDaoImpl;
import main.dao.SubjectDaoImpl;
import main.entity.Student;
import main.entity.Subject;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args){
        try {
            StudentDaoImpl sd= new StudentDaoImpl();
            SubjectDaoImpl sj = new SubjectDaoImpl();
            ArrayList<Student> arr = sd.getAll();
            ArrayList<Subject> arr1 = sj.getAll();
            for (Student sd1: arr){
                System.out.println(sd1);
            }

            for (Subject sj1:arr1){
                System.out.println(sj1);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

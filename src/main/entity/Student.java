package main.entity;

import java.time.LocalDate;

public class Student {
    private Integer id;
    private String name;
    private LocalDate dob;
    private Integer mark;

    public Student(Integer id, String name, LocalDate dob, Integer mark) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.mark = mark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", mark=" + mark +
                '}';
    }
}

package main.session4;

public class HUSTStudent extends Student{
    String n;

    public HUSTStudent(Integer id, String name, String email, String n) {
        super(id, name, email);
        this.n = n;
    }

    public void playFootball(){
        //Không có đa kế thừa
    }
}

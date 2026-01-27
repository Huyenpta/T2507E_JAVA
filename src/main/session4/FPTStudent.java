package main.session4;

public class FPTStudent extends Student{
    //FPTStudent là sub class
    //Student Super class

    String avata;

    public FPTStudent(Integer id, String name, String email, String avata) {
        super(id, name, email);
        this.avata = avata;
    }

    public void playGame(){
        System.out.println("Student playgame...");
    }
}

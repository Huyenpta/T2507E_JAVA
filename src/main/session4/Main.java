package main.session4;

public class Main {
    public static void main(String[] args){
        Student s= new Student(1,"Nguyễn Văn A","a@gmail.com");
        s.study();
        //Đối tượng không có cha con; kế thừa chỉ có tác dụng trong class
        FPTStudent f = new FPTStudent(1,"Nguyễn Văn A","a@gmail.com", "T2");
        f.study();
        //s.playGame();
        f.playGame();
        AptechStudent a = new AptechStudent(1,"Nguyễn Văn A","a@gmail.com", "T2", "N");
        a.study();
        a.playGame();
        a.run();
        a.run(5);
        a.run("v");
    }
}

package main.session4;

public class AptechStudent extends FPTStudent{
    String account;

    public AptechStudent(Integer id, String name, String email, String avata, String account) {
        super(id, name, email, avata);
        this.account = account;
    }

    public void playGame(){ //override method

        System.out.println("APTECH Student play game...");
    }

    //overload - nạp chồng
    public void run(){
        super.playGame();
        System.out.println("running 5km/h");
    }

    public void run(int x){
        System.out.println("running 10km/h");
    }

    public void run(String msg){
        System.out.println("20 km/h");
    }

    public void sing(String s, int a){

    }

    public void sing(int a, String s){

    }

}

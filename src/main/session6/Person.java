package main.session6;

public abstract class Person { //đây là 1 class abstract (trừu tượng), hàm trừu tượng là hàm không có nội dung hàm
    private String fullName;
    public String dob;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public abstract void eat();// đây là abstract function

    public abstract void sleep();// hàm là các logic của các nghiệp vụ
}

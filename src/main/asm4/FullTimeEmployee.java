package main.asm4;

public class FullTimeEmployee extends Employee{
    private Integer luongcd;

    public FullTimeEmployee(String id, String name, Integer luongcd) {
        super(id, name);
        this.luongcd = luongcd;
    }

    public Integer getLuongcd() {
        return luongcd;
    }

    public void setLuongcd(Integer luongcd) {
        this.luongcd = luongcd;
    }

    @Override
    public String Employees() {
        return super.Employees() + ", Lương cố định: " + getLuongcd();
    }

    @Override
    public Integer getSalary() {
        return getLuongcd();
    }
}

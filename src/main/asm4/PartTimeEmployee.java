package main.asm4;

public class PartTimeEmployee extends Employee{
    private Double luongtheogio;
    private Integer sogio;

    public PartTimeEmployee(String id, String name, Double luongtheogio, Integer sogio) {
        super(id, name);
        this.luongtheogio = luongtheogio;
        this.sogio = sogio;
    }

    public Double getLuongtheogio() {
        return luongtheogio;
    }

    public void setLuongtheogio(Double luongtheogio) {
        this.luongtheogio = luongtheogio;
    }

    public Integer getSogio() {
        return sogio;
    }

    public void setSogio(Integer sogio) {
        this.sogio = sogio;
    }

    @Override
    public String Employees() {
        return super.Employees() + ", Lương: " + getSalary();
    }

    @Override
    public Integer getSalary() {

        return (int) (getSogio() * getLuongtheogio());
    }
}
